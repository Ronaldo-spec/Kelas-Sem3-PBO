/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceLatihan;

/**
 *
 * @author Bedman
 */
public class mainBinatang {
    public static void main(String[] args) {
        keledai k = new keledai("Brewmaster", 4, "iri bilang bos", "Abu-abu");
        gorilla g = new gorilla("Stephen", 4, "Apa lo Tega", "Hitam nigg*");
        singa s = new singa("Jonathan", 4, "Hai Gaes", "Emas");
        
        k.displayData();
        g.displayData();
        s.displayData();
    }
}
