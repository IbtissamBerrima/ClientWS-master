
import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {

    public static void main(String[] args) {
        BanqueService stub= new BanqueWS().getBanqueServicePort();
        System.out.println("----- Conversion En Euro -----");
        System.out.println(stub.conversionEnEuro(150));
        Compte account=stub.getCompte("34");
        System.out.println("----- Code Compte  -----");
        System.out.println(account.getCode());
        System.out.println("----- Solde Compte  -----");
        System.out.println(account.getSolde());





    };

    }

