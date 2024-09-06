package org.example.services

import org.example.utils.UuidGenerater

class ProductService {

    static UUID getId(){
        return UuidGenerater.generate()
    }
}
