import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import servants.BanqueServiceImpl;

import javax.naming.InitialContext;

public class ServeurCorba {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("rootPOA"));
            rootPOA.the_POAManager().activate();
            BanqueServiceImpl od = new BanqueServiceImpl();
            InitialContext ctx = new InitialContext();
            ctx.rebind("BANQUE", rootPOA.servant_to_reference(od));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
