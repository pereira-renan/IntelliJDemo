package org.example.services

import org.example.utils.UuidGenerater

class DepartmentService {

    static UUID getId(){
        return UuidGenerater.generate()
    }
}
