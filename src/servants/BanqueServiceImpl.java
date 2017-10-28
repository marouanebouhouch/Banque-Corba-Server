package servants;

import BanqueCorba.Compte;
import BanqueCorba.IBanqueRemotePOA;

public class BanqueServiceImpl extends IBanqueRemotePOA {
    @Override
    public double conversion(double montant) {
        return montant * 12.2;
    }

    @Override
    public Compte[] getComptes() {
        Compte[] comptes = new Compte[3];
        comptes[0] = new Compte(1, Math.random()*80000 );
        comptes[1] = new Compte(2, Math.random()*80000 );
        comptes[2] = new Compte(3, Math.random()*80000 );
        return comptes;
    }

    @Override
    public Compte getCompte(int code) {
        return new Compte(code, Math.random()*80000 );
    }
}
