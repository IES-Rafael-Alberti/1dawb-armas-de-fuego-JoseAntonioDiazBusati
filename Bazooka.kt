class Bazooka(
    municion:Int,
    tipoDeMunicion:String,
    override val danio: Int,
    override val radio: Radio
    ):ArmaDeFuego("Bazooka", municion,3,tipoDeMunicion) {
    init {
        require(radio == Radio.Intermedio|| radio == Radio.Amplio || radio == Radio.Enorme){"Error radio"}

    }
}