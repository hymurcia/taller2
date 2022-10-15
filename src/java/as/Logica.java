package as;

public class Logica {

    public String robot(String nombre, String peticion) {
        String respuesta = "";
        if ("hola".equals(peticion)) {
            respuesta = "hola " + nombre + " ¿como estas? ";
        } else {
            if ("mal".equals(peticion)) {
                respuesta = "Que triste, ¿Ya comiste algo " + nombre + "?";
            } else {
                if ("bien".equals(peticion)) {
                    respuesta = "Me alegra, ¿Ya comiste algo " + nombre + "?";
                } else {
                    if ("si".equals(peticion)) {
                        respuesta = "Me alegra, ¿tu cabello es largo o corto " + nombre + "?";
                    } else {
                        if ("no".equals(peticion)) {
                            respuesta = "Deberias comer, ¿tu cabello es largo o corto " + nombre + "?";
                        } else {
                            if ("corto".equals(peticion) || "largo".equals(peticion)) {
                                respuesta = "Me alegra,El mio es igual... ¿De que color son tus ojos " + nombre + "?";
                            } else {
                                if ("azules".equals(peticion) || "verdes".equals(peticion) || "cafes".equals(peticion)) {
                                    respuesta = "Me alegra,los mios son rojos! ¿tomas agua o cafe " + nombre + "?";
                                } else {
                                    if ("cafe".equals(peticion) || "agua".equals(peticion)) {
                                        respuesta = "Que rico! " + nombre + "";
                                    } else {
                                        if (peticion != "null" || peticion != " " || peticion != null) {
                                            respuesta = "Iniciemos despacio por un simple: hola";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (respuesta);
    }

}
