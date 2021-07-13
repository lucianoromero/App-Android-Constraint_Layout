package alura.com.br.util;

public class DiasUtil {

    public static final String DIASPLURAL = " dias";
    public static final String DIASINGULAR = " dia";

    public static String formataEmTexto(int quantidadeDeDias) {
        if (quantidadeDeDias > 1) {
            return quantidadeDeDias + DIASPLURAL;
        }
        return quantidadeDeDias + DIASINGULAR;
    }


}
