package com.example.appinterfacesembarquees

class Notes(val note: Int){
    val notes = arrayOf("Fa", "Sol", "La", "Si", "Do", "Re", "Mi", "Fa", "Sol", "La", "Si", "Do", "Re", "Mi")

    override fun toString(): String {
        return notes[note]
    }



}

