package Control;
import data.ConectaDb;

public class clsMedicoDAO{
    ConectaDb conecta = new ConectaDb();
    
    //<editor-fold defaultstate="collapsed" desc="METODOS">
    /**
     * Metodo que permite el registro de un medico en la base de datos
     * @param prmMedico objeto de tipo medico recibido por parametro
     * @return Verdadero si el proceso finalizaó con exito, falso de lo contrario
     */
    public boolean registrarMedico(clsMedico prmMedico) {
        boolean registrar = false;
        String varFecha = prmMedico.getAtrFechaNac();
        
        String sql = "INSERT INTO medico (per_id, m_tprofesional, per_nombre, per_apellido, per_fechanac, "
                + "per_telefono, per_email, per_direccion, m_especialidad, m_aniosExp, m_estado, m_consultorio) "
                + "VALUES (" + prmMedico.getAtrDNI() + "," + prmMedico.getAtrTProfesional() +
                ", '"+ prmMedico.getAtrNombre() + "', '" + prmMedico.getAtrApellido() + "', '"
                + varFecha + "', " + prmMedico.getAtrTelefono() + ", '" + prmMedico.getAtrEmail()
                + "', '" + prmMedico.getAtrDireccion() + "', '" + prmMedico.getAtrEspecialidad() + "', "
                + prmMedico.getAtrExperiencia() + ", 'Activo'," +  prmMedico.getConsultorio() + ");";
        
        conecta.conectar();
        if(conecta.transaccion(sql)) {
            registrar = true;
            conecta.desconectar();
        }
        return registrar;
    }
//</editor-fold>
   
//    public static void main(String[] args) {
//clsMedicoDAO dao = new clsMedicoDAO();
//clsMedico medico = new clsMedico(54645896, "Johnny", "Cash", new Calendar(), 2353, "shds@example.es", "downtown", 67678, "Anestesiologia", (byte) 10);
//dao.registrarMedico(medico);
//}
}