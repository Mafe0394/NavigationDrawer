package com.mfvargas.navigationdrawer.modelos

class User{

    var nameUser=""
    set(value){field="Nombre $value"}
    private var typeUser=""
    private var stateUser=false

    constructor(nameUser:String,typeUser: String,stateUser: Boolean){
        this.nameUser=nameUser
    }
}