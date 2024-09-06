package org.example.services

import org.example.utils.UuidGenerator

class UserService {

    static UUID getId(){
        return UuidGenerator.generate()
    }
}
