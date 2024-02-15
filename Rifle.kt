class Rifle(
    municion:Int,
    tipoDeMunicion:String,
    override val danio: Int,
    override val radio: Radio
    ):ArmaDeFuego("Rifle", municion,2,tipoDeMunicion) {
    init {
        require(radio == Radio.Corto || radio == Radio.Intermedio){"Error radio"}

    }
}