class Rifle(
    municion:Int,
    tipoDeMunicion:String,
    override val danio: Int,
    override val radio: Radio
    ):ArmaDeFuego("Rifle", municion,2,tipoDeMunicion) {
    init {
        require(radio == Radio.CORTO || radio == Radio.INTERMEDIO){"Error radio"}

    }
}