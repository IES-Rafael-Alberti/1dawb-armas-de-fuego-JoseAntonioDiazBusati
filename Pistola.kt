class Pistola(
    municion:Int,
    tipoDeMunicion:String,
    override val danio: Int,
    override val radio: Radio
    ):ArmaDeFuego("Pistola", municion,1,tipoDeMunicion) {
        init {
            require(radio == Radio.REDUCIDO || radio == Radio.CORTO){"Error radio"}
        }
}