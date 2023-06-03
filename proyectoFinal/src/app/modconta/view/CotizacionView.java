package app.modconta.view;
import app.modconta.databaase.Helper;
import app.modconta.databaase.util;
import MODEL.EquipoDAO;
import MODEL.ServicioDAO;
import MODEL.VentaDAO;
import MODEL.detserDAO;
import app.modconta.business.Negocios;
import app.modconta.databaase.dbBean;
import app.modconta.entity.Cotizacion;
import app.modconta.entity.DetallePedido;
import app.modconta.entity.Pedido;
import java.sql.Connection;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class CotizacionView extends javax.swing.JInternalFrame 
{
      //variables  
    EquipoDAO eqx = new EquipoDAO();
    ServicioDAO ServicioDAO;
    detserDAO detserDAO;
    VentaDAO vaux;
    
    
    Negocios boPedido;
    
    DefaultTableModel dtm,dtm2;
    boolean sw = false;
    String cad = "";
    //int idClie; 
    Helper h = new Helper();
    
    public CotizacionView() 
    {
        initComponents();
        boPedido = new Negocios();
        //ServicioDAO = new ServicioDAO();
        //detserDAO = new detserDAO();
       
        //comboEquipos.setEnabled(false);
        //AreaCausa.setEnabled(false);
        //AreaFallas.setEnabled(false);
        //AreaSolucion.setEnabled(false);
        //comboClientes.setModel(h.getvaluesVentas("Venta"));
        comboPedidos.setModel(boPedido.getvaluesName("id_pedido", "pedido"));
       // comboGrupos.setModel(boPedido.getvaluesName("codigo", "grupo_ma"));
       //comboClientes.setModel(h.getvaluesTienda("Tienda"));
         AutoCompleteDecorator.decorate(comboPedidos);
       //  dtm2 = (DefaultTableModel)tbGrupos.getModel();
        //dtm2 = (DefaultTableModel)jTable1.getModel();
       //llenaTabla(false, "");
    }

      //Método de validación
       public boolean valida()
      {
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

     

    //MÉTODO PARA LIMPIAR CONTROLES 
    public void limpiaControles()
     {
        this.btnRegistrar.setText("Registrar");
       //   this.txtNombre.requestFocus();
     }
 
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnFechaEntrega = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        comboPedidos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtfolio = new javax.swing.JTextField();
        btnLeer = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnExportarPDF = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnAprobar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnModificarPedido = new javax.swing.JButton();
        lbMonto = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("GENERACIÓN DE COTIZACIÓN");

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));

        jPanel4.setLayout(null);

        btnFechaEntrega.setDate(Calendar.getInstance().getTime());
        btnFechaEntrega.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(btnFechaEntrega);
        btnFechaEntrega.setBounds(80, 80, 130, 20);

        jLabel5.setText("Monto (S/.)");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(30, 120, 70, 20);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar);
        btnLimpiar.setBounds(510, 40, 120, 25);

        jLabel10.setText("Descripción");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(30, 160, 100, 20);

        comboPedidos.setEditable(true);
        comboPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPedidosActionPerformed(evt);
            }
        });
        jPanel4.add(comboPedidos);
        comboPedidos.setBounds(80, 50, 130, 22);

        jLabel2.setText("Folio Coti");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(17, 20, 70, 16);
        jPanel4.add(txtfolio);
        txtfolio.setBounds(90, 20, 130, 22);

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });
        jPanel4.add(btnLeer);
        btnLeer.setBounds(510, 10, 120, 25);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.gif"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscar);
        btnBuscar.setBounds(240, 20, 50, 30);
        jPanel4.add(txtDescripcion);
        txtDescripcion.setBounds(110, 160, 480, 22);

        jLabel6.setText("Fecha");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(30, 80, 50, 20);

        jLabel11.setText("Pedido");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(30, 50, 100, 20);
        jPanel4.add(txtMonto);
        txtMonto.setBounds(110, 120, 130, 22);

        jTabbedPane1.addTab("Registrar Coti", jPanel4);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnExportarPDF.setText("Exportar PDF");
        btnExportarPDF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExportarPDF.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnExportarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarPDFActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.setName("btnRegistrarPedido"); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        btnRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRegistrarKeyPressed(evt);
            }
        });

        btnAprobar.setText("Aprobar");
        btnAprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprobarActionPerformed(evt);
            }
        });

        btnAnular.setText("Anular");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        btnModificarPedido.setText("Modificar");
        btnModificarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPedidoActionPerformed(evt);
            }
        });

        lbMonto.setText("Monto (s/.)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExportarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAprobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(221, 221, 221))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 164, Short.MAX_VALUE)
                    .addComponent(lbMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 641, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnRegistrar)
                .addGap(3, 3, 3)
                .addComponent(btnModificarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAprobar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportarPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbMonto)
                    .addGap(0, 405, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiaControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        try {
        int id = 0, est;
        int idClient = 0;
        String pr = "";
        if(valida() == true)
        {
            util u = new util();
            //Pedido p = new Pedido();
            Cotizacion c = new Cotizacion();
            // idClient = boPedido.ObtenerCampoTablaGenerico("clientes", "idcliente", "nombre", comboPedidos.getSelectedItem().toString(),true);
            c.setRol("RMAB");
           // c.setIdPedido(boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText(),false));
            c.setIdPedido(Integer.parseInt(comboPedidos.getSelectedItem().toString()));
            c.setDescripcion(txtDescripcion.getText().toString());
            c.setMonto(txtMonto.getText().toString());
//p.setIdCliente(idClient);
            //p.setFolio(txtfolio.getText()); 
            //s.setIdVenta(Integer.parseInt(comboGrupos.getSelectedItem().toString()));
             //configuramos la fecha 
//             String dia_i = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.DAY_OF_MONTH));
//             String mes_i = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.MONTH) + 1);
//             String year_i = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.YEAR));
             //String fecha_i = (year_i + "/" + mes_i+ "/" + dia_i);
             //s.setFechaEntrega(fecha_i);
             
              //configuramos la fecha
//String dia_i2 = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.DAY_OF_MONTH));
//String mes_i2 = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.MONTH) + 1);
//String year_i2 = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.YEAR));
             //String fecha_i2 = (dia_i2 + "/" + mes_i2+ "/" +year_i2 );
            // s.setFechaRecibido(fecha_i2);
            //s.setIdTienda(vaux.FindIDTienda(this.comboClientes.getSelectedItem().toString()));
           // id = u.idNext("Servicio", "idServicio");
            //pr = "insert";
             //s.setIdServicio(id);
            //ServicioDAO.procesaItem(s, pr);  
            if(boPedido.RegistrarCotizacion(c) == true)
            {
//                for(int i =0;i<dtm2.getRowCount();i++)
//                { 
//                    int  idGrupo = boPedido.ObtenerCampoTablaGenerico("grupo_ma", "id_grupo", "codigo", dtm2.getValueAt(i, 0).toString().trim(),true);
//                    DetallePedido detpe = new  DetallePedido();
//                    detpe.setId_grupo(idGrupo);
//                    detpe.setPlantel(Integer.parseInt(dtm2.getValueAt(i, 1).toString().trim()));
//                    detpe.setCantidadHoras(Float.parseFloat(dtm2.getValueAt(i, 2).toString().trim()));
//                    detpe.setObservaciones(dtm2.getValueAt(i,3).toString());
//                    //int aux = boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText());
//                    // String aux2= String.valueOf(aux);
//                            
//                    detpe.setIdPedido(boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText(),true));
//                    //detse.setP_unit(Float.parseFloat(dtm2.getValueAt(i, 3).toString().trim()));
//                    //detse.setImporte(Float.parseFloat(dtm2.getValueAt(i, 4).toString().trim()));      
//                    if(!boPedido.registrarItemPedido(detpe)==true) 
//                    {
//                       JOptionPane.showMessageDialog(null, "No se pudo registrar el detalle ", "ERROR", JOptionPane.ERROR_MESSAGE);
//                    }
//                }
                    JOptionPane.showMessageDialog(null, "Se registró la cotización con éxito ", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                    limpiaControles();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo registrar correctamente la cotización", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        }
        catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null, "Ocurrió un error al registrar la cotización " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
        
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    private void btnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrarKeyPressed

    }//GEN-LAST:event_btnRegistrarKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnExportarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarPDFActionPerformed
   //   try { 
            //creamos un objeto dbBean
//              dbBean aux = new dbBean();
//              HashMap map = new HashMap();
//              //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
//              Connection cn = aux.getConnection();
//              JasperReport jr= JasperCompileManager.compileReport("src/app.modconta.reports/FichaTecnica.jrxml");
//              // map.put("idCliente",idClie); 
//              JasperPrint jp = JasperFillManager.fillReport(jr,null,cn);
//              JasperViewer jv= new JasperViewer(jp,false);
//              jv.setVisible(true);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }  
    

    }//GEN-LAST:event_btnExportarPDFActionPerformed

    private void btnAprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprobarActionPerformed
      try {
        int id = 0, est;
        int idClient = 0;
        String pr = "";
        if(valida() == true)
        {
            util u = new util();
            Pedido p = new Pedido();
            //c.setIdPedido(boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText(),false));
            
            p.setFolio(txtfolio.getText());
            p.setEstado("A");
            if(boPedido.ActualizarPedido(p) == true)
            {
               
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo aprobar correctamente la cotización", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        }
        catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null, "Ocurrió un error al APROBAR EL PEDIDO " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        finally
        {
            JOptionPane.showMessageDialog(null, "Se aprobó el pedido con éxito", "ÉXITO", JOptionPane.OK_OPTION);
            limpiaControles();
        }
    }//GEN-LAST:event_btnAprobarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        try {
        int id = 0, est;
        int idClient = 0;
        String pr = "";
        if(valida() == true)
        {
            util u = new util();
            Pedido p = new Pedido();
            idClient = boPedido.ObtenerCampoTablaGenerico("clientes", "idcliente", "nombre", comboPedidos.getSelectedItem().toString(),true);
            p.setIdCliente(idClient);
            p.setIdPedido(boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText(),false));
            p.setFolio(txtfolio.getText());
            p.setEstado("N");
            if(boPedido.ActualizarPedido(p) == true)
            {
               
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo anular correctamente el pedido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        }
        catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null, "Ocurrió un error al APROBAR EL PEDIDO " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        finally
        {
            JOptionPane.showMessageDialog(null, "Se anuló el pedido con éxito", "ÉXITO", JOptionPane.OK_OPTION);
            limpiaControles();
        }
    }//GEN-LAST:event_btnAnularActionPerformed

    private void comboPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPedidosActionPerformed

    private void btnModificarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarPedidoActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int x ;
        x = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el codigo del Empleado"));
        try {
            //creamos un objeto dbBean
            dbBean aux = new dbBean();
            HashMap map = new HashMap();
            //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
            Connection cn = aux.getConnection();
            JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/EmpleadoReporte.jrxml");
            map.put("idCliente",x);
            JasperPrint jp = JasperFillManager.fillReport(jr,map,cn);
            // JasperPrint jp= JasperFillManager.fillReport(jr,idClie,cn);

            JasperViewer jv= new JasperViewer(jp,false);
            jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnAprobar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExportarPDF;
    private com.toedter.calendar.JDateChooser btnFechaEntrega;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarPedido;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbMonto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtfolio;
    // End of variables declaration//GEN-END:variables
}


   





