package org.example.services

import org.example.utils.UuidGenerator

class ProductService {

    static UUID getId(){
        return UuidGenerator.generate()
    }
}
