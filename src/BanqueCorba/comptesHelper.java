package BanqueCorba;


/**
* BanqueCorba/comptesHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* Saturday, October 28, 2017 2:33:37 PM WEST
*/

abstract public class comptesHelper
{
  private static String  _id = "IDL:BanqueCorba/comptes:1.0";

  public static void insert (org.omg.CORBA.Any a, BanqueCorba.Compte[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static BanqueCorba.Compte[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = BanqueCorba.CompteHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (BanqueCorba.comptesHelper.id (), "comptes", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static BanqueCorba.Compte[] read (org.omg.CORBA.portable.InputStream istream)
  {
    BanqueCorba.Compte value[] = null;
    int _len0 = istream.read_long ();
    value = new BanqueCorba.Compte[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = BanqueCorba.CompteHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, BanqueCorba.Compte[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      BanqueCorba.CompteHelper.write (ostream, value[_i0]);
  }

}