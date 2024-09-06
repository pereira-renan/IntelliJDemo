package org.example.services

import org.example.utils.UuidGenerator

class DepartmentService {

    static UUID getId(){
        return UuidGenerator.generate()
    }
}
