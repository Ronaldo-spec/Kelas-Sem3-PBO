import interfaceLatihan.IBerprestasi;
import interfaceLatihan.iCumLaude;
import interfaceLatihan.mahasiswa;
import interfaceLatihan.pascaSarjana;
import interfaceLatihan.rektor;
import interfaceLatihan.sarjana;

/**
 *
 * @author Bedman
 */
public class interfaceMain {
    public static void main(String[] args) {
        rektor pakrektor = new rektor();
        sarjana sarjanaCumlaude = new sarjana("Mermaidman");
        pascaSarjana master = new pascaSarjana("Spongebob");

       // pakrektor.beriSertifikatMawapres(sarjanaCumlaude);
      
        pakrektor.beriSertifikatMawapres(master);
        master.menjuaraiKompetisi();
        master.membuatPublikasiIlmiah();
        System.out.println("====================================================");
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        master.menjuaraiKompetisi1();
        master.membuatPublikasiIlmiah1();
        System.out.println("====================================================");
       
        
    }
}
