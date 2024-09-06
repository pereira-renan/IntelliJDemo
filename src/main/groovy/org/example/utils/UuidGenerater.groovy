package org.example.utils

class UuidGenerater {
    static UUID generate(){
        return UUID.randomUUID()
    }

    static UUID convertFromString(String userId){
        return UUID.fromString(userId)
    }
}