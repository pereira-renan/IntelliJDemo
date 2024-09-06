package org.example.controllers

import org.example.services.AdminService


class AdminController {

    AdminService adminService

    def getName() {
        def userName = adminService()
        def userId = UuidGenerator.generate()

        return [userName: userName, userId: userId]
    }
}
