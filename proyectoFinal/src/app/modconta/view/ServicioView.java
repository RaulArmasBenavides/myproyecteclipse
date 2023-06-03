package app.modconta.view;
import app.modconta.databaase.Helper;
import app.modconta.databaase.dbBean;
import app.modconta.databaase.util;
import app.modconta.entity.DetalleVenta;
import app.modconta.entity.DetalleServicio;
import app.modconta.entity.Servicio;
import MODEL.EquipoDAO;
import MODEL.ServicioDAO;
import MODEL.VentaDAO;
import MODEL.detserDAO;
import java.sql.Connection;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class ServicioView extends javax.swing.JInternalFrame {
      //variables  
    EquipoDAO eqx = new EquipoDAO();
    ServicioDAO ServicioDAO;
    detserDAO detserDAO;
    VentaDAO vaux;
    DefaultTableModel dtm,dtm2;
    boolean sw = false;
    String cad = "";
    int idClie; 
    Helper h = new Helper();
    public ServicioView() {
        ServicioDAO = new ServicioDAO();
        detserDAO = new detserDAO();
        initComponents();
//        comboEquipos.setEnabled(false);
//        AreaCausa.setEnabled(false);
//        AreaFallas.setEnabled(false);
//        AreaSolucion.setEnabled(false);
        //comboVentas.setModel(h.getvaluesVentas("Venta"));
        comboTienda.setModel(h.getvaluesTienda("Tienda"));
        AutoCompleteDecorator.decorate(comboTienda);
         dtm = (DefaultTableModel)tblServicio.getModel();
//         dtm2 = (DefaultTableModel)jTable1.getModel();
       // llenaTabla(false, "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnFechaEntrega = new com.toedter.calendar.JDateChooser();
        btnFechaRecibido = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        comboVentas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboTienda = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblServicio = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecomendacion = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MANTENIMIENTO ORDEN DE SERVICIO");

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));

        jPanel4.setLayout(null);

        jLabel8.setText("Número de Factura");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 20, 100, 16);

        btnFechaEntrega.setDate(Calendar.getInstance().getTime());
        btnFechaEntrega.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(btnFechaEntrega);
        btnFechaEntrega.setBounds(500, 50, 120, 30);

        btnFechaRecibido.setDate(Calendar.getInstance().getTime());
        btnFechaRecibido.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(btnFechaRecibido);
        btnFechaRecibido.setBounds(500, 10, 120, 30);

        jLabel5.setText("Fecha de Entrega");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(360, 50, 120, 20);

        comboVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVentasActionPerformed(evt);
            }
        });
        jPanel4.add(comboVentas);
        comboVentas.setBounds(150, 20, 120, 22);

        jLabel6.setText("Tienda");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(90, 50, 90, 16);

        jLabel9.setText("Detalle de servicio");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(20, 110, 110, 20);
        jPanel4.add(comboTienda);
        comboTienda.setBounds(150, 50, 120, 22);

        tblServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblServicio);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(20, 140, 630, 270);

        jLabel2.setText("Recomendaciones");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(20, 430, 103, 16);

        txtRecomendacion.setColumns(20);
        txtRecomendacion.setRows(5);
        jScrollPane1.setViewportView(txtRecomendacion);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(140, 420, 510, 100);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar);
        btnLimpiar.setBounds(280, 30, 120, 25);

        jLabel13.setText("Fecha de Recibido");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(360, 20, 110, 20);

        jTabbedPane1.addTab("Ficha Técnica", jPanel4);

        jButton5.setText("Registrar");

        jButton7.setText("Aprobar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Anular");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Imprimir");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton6.setText("Generar Factura");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jButton7)))
                        .addGap(1, 1, 1)
                        .addComponent(jButton8)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jButton6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // limpiaControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    

    public void limpiaControles()
 {
//  this.btnRegistrar.setText("Registrar");
   //   this.txtNombre.requestFocus();
 }
 
    public void limpiaTabla(){
        DefaultTableModel dm = (DefaultTableModel)this.tblServicio.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }
      public boolean valida(){
   /*
        boolean sw = false;
        if(this.txtApellidos.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Ingrese Apellidos");
        }else{
            if(this.txtNombre.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese Nombres");
            }else{
                sw = true;
            }
        }*/
        return true;

    }  
    private void comboVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVentasActionPerformed
//        comboEquipos.setEnabled(true);
//        comboEquipos.setModel(h.getvaluesEqVe(Integer.parseInt(comboVentas.getSelectedItem().toString())));
    }//GEN-LAST:event_comboVentasActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //         int x ;
        //
        //       x = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el numero del Factura"));
        //       try {
            //            //creamos un objeto dbBean
            //              dbBean aux = new dbBean();
            //              HashMap map = new HashMap();
            //              //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
            //              Connection cn = aux.getConnection();
            //              JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/ClienteReporte.jrxml");
            //              map.put("idVenta",x);
            //              JasperPrint jp = JasperFillManager.fillReport(jr,map,cn);
            //              // JasperPrint jp= JasperFillManager.fillReport(jr,idClie,cn);
            //
            //              JasperViewer jv= new JasperViewer(jp,false);
            //              jv.setVisible(true);
            //        } catch (Exception e) {
            //            System.out.println(e);
            //        }
        //
        /* try {
            dbBean aux = new dbBean();
            //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
            Connection cn = aux.getConnection();
            JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/FacturaReporte.jrxml");
            JasperPrint jp= JasperFillManager.fillReport(jr,null,cn);
            JasperViewer jv= new JasperViewer(jp,false);
            jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }*/
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser btnFechaEntrega;
    private com.toedter.calendar.JDateChooser btnFechaRecibido;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboTienda;
    private javax.swing.JComboBox<String> comboVentas;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblServicio;
    private javax.swing.JTextArea txtRecomendacion;
    // End of variables declaration//GEN-END:variables
}
