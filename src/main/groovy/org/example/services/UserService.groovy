package org.example.services

import org.example.utils.UuidGenerater

class UserService {

    static UUID getId(){
        return UuidGenerater.generate()
    }
}
