package pe.upc.repaso;

public class App2 {
    static double obtenerMontoTotalOpcionales(String rubro, int especializado, int tecnico) {
        double monto = 0;
        double montoEspecializado = 0;
        double montoTecnico=0;
        switch (rubro) {
            case "Bodegas":
                if (especializado == 1) {
                    montoEspecializado = 3500;
                }
                if(tecnico == 1){
                    montoTecnico = 400;
                }
                break;
            case "Mecanicas":
                if (especializado == 1) {
                    montoEspecializado = 1800;
                }
                if(tecnico == 1){
                    montoTecnico = 200;
                }
                break;
            case "Barberias":
                if (especializado == 1) {
                    montoEspecializado = 2400;
                }
                if(tecnico == 1){
                    montoTecnico = 100;
                }
                break;
            case "Restaurant":
                if (especializado == 1) {
                    montoEspecializado = 2000;
                }
                if(tecnico == 1){
                    montoTecnico = 100;
                }
                break;
        }

        monto = montoEspecializado + montoTecnico;
        return monto;
    }

    public static void main(String[] args) {

        System.out.println(obtenerMontoTotalOpcionales("Barberias",1,0));
    }
}
