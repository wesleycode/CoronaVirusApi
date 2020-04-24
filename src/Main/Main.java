package Main;

import Api.FetchData;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        try {

            final String pais = "BRA";

            JSONObject jsonObject = FetchData.getPais(pais);

            System.out.println("\n### ESTATÍSTICAS DO CORONA VIRUS NO BRASIL ###\n\n");

            System.out.println("|\tRECUPERADOS: " + jsonObject.getJSONObject("recovered").getInt("value"));
            System.out.println("|\tCONFIRMADOS: " + jsonObject.getJSONObject("confirmed").getInt("value"));
            System.out.println("|\tMORTOS: " + jsonObject.getJSONObject("deaths").getInt("value"));
            System.out.println("|\tDATA DA ULTIMA ATUALIZAÇÃO: " + jsonObject.getString("lastUpdate") + "\n\n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
