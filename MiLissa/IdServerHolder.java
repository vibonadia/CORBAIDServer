package MiLissa;

/**
* MiLissa/IdServerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idserver.idl
* Tuesday, January 22, 2013 10:56:45 PM BRST
*/

public final class IdServerHolder implements org.omg.CORBA.portable.Streamable
{
  public MiLissa.IdServer value = null;

  public IdServerHolder ()
  {
  }

  public IdServerHolder (MiLissa.IdServer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MiLissa.IdServerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MiLissa.IdServerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MiLissa.IdServerHelper.type ();
  }

}