package org.example.controllers

class AdminController {

    // Fix this
    AdminService adminService

    def getName() {
        def userName = adminService.getUserName()
        def userId = UuidGenerator.generate()

        return [userName: userName, userId: userId]
    }
}
