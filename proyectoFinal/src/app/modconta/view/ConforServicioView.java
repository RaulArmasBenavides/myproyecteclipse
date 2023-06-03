package app.modconta.view;
import app.modconta.databaase.Helper;
import app.modconta.databaase.util;
import app.modconta.entity.DetalleServicio;
import MODEL.EquipoDAO;
import MODEL.ServicioDAO;
import MODEL.VentaDAO;
import MODEL.detserDAO;
import app.modconta.business.Negocios;
import app.modconta.databaase.dbBean;
import app.modconta.entity.ConformidadServicio;
import app.modconta.entity.Constantes;
import app.modconta.entity.DetalleConforSer;
import app.modconta.entity.DetallePedido;
import app.modconta.entity.Pedido;
import java.sql.Connection;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class ConforServicioView extends javax.swing.JInternalFrame 
{
      //variables  
    EquipoDAO eqx = new EquipoDAO();
    ServicioDAO ServicioDAO;
    detserDAO detserDAO;
    VentaDAO vaux;
    String RUCClient = ""; // ruc cliente 
    
    Negocios boPedido;
    
    DefaultTableModel dtm,dtm2;
    boolean sw = false;
    String cad = "";
    //int idClie; 
    Helper h = new Helper();
    
    public ConforServicioView() 
    {
        initComponents();
        boPedido = new Negocios();
        comboClientes.setModel(boPedido.getvaluesName("nombre", "clientes"));
        comboResponsables.setModel(boPedido.getvaluesName("nombre +' ' + ap_paterno +' '+  ap_materno", "empleado"));
        comboSede.setModel(boPedido.getvaluesName("nombre", "sede"));
        comboOS.setModel(boPedido.getvaluesName("folio", "servicio"));
        RUCClient =String.valueOf(boPedido.ObtenerCampoTablaGenerico("clientes", "RUC", "nombre", comboClientes.getSelectedItem().toString(),true));
        txtRucCliente.setText(RUCClient);
        txtRucCliente.enable(false);
        AutoCompleteDecorator.decorate(comboOS);
         dtm2 = (DefaultTableModel)tbDetalles.getModel();
        //dtm2 = (DefaultTableModel)jTable1.getModel();
       //llenaTabla(false, "");
    }

      //Método de validación
       public boolean valida()
      {
   
        if(this.txtFolio.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Debe Ingresar N° Folio de acta de conformidad de servicio");
           return false;
        }

        if(this.txtFolio.getText().length()> Constantes.MAX_TAMAMO_FOLIO)
        {
        JOptionPane.showMessageDialog(null, "El folio no debe exceder " + String.valueOf(Constantes.MAX_TAMAMO_DIRECCION) + " caracteres" , "VALIDACION", JOptionPane.WARNING_MESSAGE);
        return false;
        }
        
        if(dtm2.getRowCount()<=0)
        {
        JOptionPane.showMessageDialog(this, "No existe detalles en el pedido de compra N°"+ txtFolio.getText()+ ". Por favor, debe ingresar al menos un detalle.");
        return false;
        }
            
            
        return true;
      }

     

    //MÉTODO PARA LIMPIAR CONTROLES 
    public void limpiaControles()
     {
        this.txtNombreResponable.setText("");   
        this.txtdescripcion.setText("");
        this.txtobservaciondetalle1.setText("");
       // this.txtMonto.setText("");
       // this.txtPlantel.setText("");
        this.btnRegistrar.setText("Registrar");
       //   this.txtNombre.requestFocus();
     }
 
    public void limpiaTabla()
    {
        DefaultTableModel dm = (DefaultTableModel)this.tbDetalles.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnFechaRecepcion = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbDetalles = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNombreResponable = new javax.swing.JTextField();
        lblSede = new javax.swing.JLabel();
        comboOS = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        lblObservacion = new javax.swing.JLabel();
        btnLeer = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        comboResponsables = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lblSede1 = new javax.swing.JLabel();
        comboSede = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        comboClientes = new javax.swing.JComboBox<>();
        txtRucCliente = new javax.swing.JTextField();
        txtobservaciondetalle1 = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spincant = new javax.swing.JSpinner();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnExportarPDF = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnprotocolo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ACTA DE CONFORMIDAD DE SERVICIOS");

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));

        jPanel4.setLayout(null);

        btnFechaRecepcion.setDate(Calendar.getInstance().getTime());
        btnFechaRecepcion.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(btnFechaRecepcion);
        btnFechaRecepcion.setBounds(120, 110, 120, 20);

        tbDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Observación", "Horas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbDetalles);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(40, 280, 870, 150);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/agregar.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregar);
        btnAgregar.setBounds(920, 140, 35, 33);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/update.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificar);
        btnModificar.setBounds(920, 180, 35, 33);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar);
        btnEliminar.setBounds(920, 220, 37, 34);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar);
        btnLimpiar.setBounds(840, 50, 120, 25);

        jLabel9.setText("Fecha");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(30, 110, 130, 16);
        jPanel4.add(txtNombreResponable);
        txtNombreResponable.setBounds(410, 80, 120, 22);

        lblSede.setText("Orden de Serv N°");
        jPanel4.add(lblSede);
        lblSede.setBounds(550, 80, 110, 20);

        comboOS.setEditable(true);
        comboOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOSActionPerformed(evt);
            }
        });
        jPanel4.add(comboOS);
        comboOS.setBounds(670, 80, 150, 22);

        jLabel2.setText("Folio");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(30, 20, 27, 16);
        jPanel4.add(txtDireccion);
        txtDireccion.setBounds(390, 20, 430, 22);
        jPanel4.add(txtdescripcion);
        txtdescripcion.setBounds(120, 180, 780, 22);

        lblObservacion.setText("Observación");
        jPanel4.add(lblObservacion);
        lblObservacion.setBounds(30, 210, 70, 20);

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });
        jPanel4.add(btnLeer);
        btnLeer.setBounds(840, 20, 120, 25);

        jLabel11.setText("Responsable");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(30, 80, 80, 20);

        comboResponsables.setEditable(true);
        comboResponsables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboResponsablesActionPerformed(evt);
            }
        });
        jPanel4.add(comboResponsables);
        comboResponsables.setBounds(120, 80, 280, 22);

        jLabel7.setText("Dirección");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(330, 20, 60, 16);

        lblSede1.setText("Sede");
        jPanel4.add(lblSede1);
        lblSede1.setBounds(600, 50, 60, 20);

        comboSede.setEditable(true);
        comboSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSedeActionPerformed(evt);
            }
        });
        jPanel4.add(comboSede);
        comboSede.setBounds(670, 50, 150, 22);

        jLabel12.setText("Cliente");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(30, 50, 70, 20);

        comboClientes.setEditable(true);
        comboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClientesActionPerformed(evt);
            }
        });
        jPanel4.add(comboClientes);
        comboClientes.setBounds(120, 50, 280, 22);
        jPanel4.add(txtRucCliente);
        txtRucCliente.setBounds(410, 50, 120, 22);
        jPanel4.add(txtobservaciondetalle1);
        txtobservaciondetalle1.setBounds(120, 210, 780, 22);

        lblDescripcion.setText("Descripción");
        jPanel4.add(lblDescripcion);
        lblDescripcion.setBounds(30, 180, 70, 16);

        txtFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioActionPerformed(evt);
            }
        });
        jPanel4.add(txtFolio);
        txtFolio.setBounds(120, 20, 130, 22);

        jLabel4.setText("Horas");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(750, 240, 50, 20);

        spincant.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));
        jPanel4.add(spincant);
        spincant.setBounds(810, 240, 89, 22);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.gif"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscar);
        btnBuscar.setBounds(260, 10, 40, 30);

        jTabbedPane1.addTab("Registro Acta", jPanel4);

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

        btnprotocolo.setText("Protocolos Prueba");
        btnprotocolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprotocoloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExportarPDF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnprotocolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(454, 454, 454)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnprotocolo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExportarPDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiaControles();
        limpiaTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        try {
        int id = 0, est;
        int idClient = 0;
        String pr = "";
        if(valida() == true)
        {
            util u = new util();
          //  Pedido p = new Pedido();
             ConformidadServicio co = new ConformidadServicio();
            idClient = boPedido.ObtenerCampoTablaGenerico("clientes", "idcliente", "nombre", comboOS.getSelectedItem().toString(),true);
            co.setIdCliente(idClient);
            co.setFolio(txtFolio.getText());
            co.setDireccion(this.txtDireccion.getText());
            co.setSede(this.comboSede.getSelectedItem().toString());
            co.setIdServicio(boPedido.ObtenerCampoTablaGenerico("servicio", "idServicio", "folio", comboOS.getSelectedItem().toString(),true));
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
            
            if(boPedido.RegistrarConformidad(co) == true)
            {
                for(int i =0;i<dtm2.getRowCount();i++)
                { 
                    //int  idGrupo = boPedido.ObtenerCampoTablaGenerico("grupo_ma", "id_grupo", "codigo", dtm2.getValueAt(i, 0).toString().trim(),true);
                    DetalleConforSer detse = new DetalleConforSer();
                
                   // detse.setIdServicio(idGrupo);
                    detse.setDescripcion(dtm2.getValueAt(i,0).toString());
//                     JOptionPane.showMessageDialog(null, dtm2.getValueAt(i,0).toString(), "aviso", JOptionPane.INFORMATION_MESSAGE);
                    detse.setObservaciones(dtm2.getValueAt(i,1).toString());
//                        JOptionPane.showMessageDialog(null, dtm2.getValueAt(i,1).toString(), "aviso", JOptionPane.INFORMATION_MESSAGE);
                    detse.setCantidadHoras(Float.parseFloat(dtm2.getValueAt(i,2).toString().trim()));
//                        JOptionPane.showMessageDialog(null, dtm2.getValueAt(i,2).toString(), "aviso", JOptionPane.INFORMATION_MESSAGE);
                    //int nro = boPedido.ObtenerCampoTablaGenerico("grupo_ma", "id_grupo", "codigo", dtm2.getValueAt(i, 0).toString().trim(),true);
                    detse.setIdConforServicio(boPedido.ObtenerCampoTablaGenerico("confor_servicio", "idconfor_servicio", "folio", txtFolio.getText(),true));
                    
                    if(!boPedido.registrarItemConformidaddetse(detse)==true) 
                    {
                       JOptionPane.showMessageDialog(null, "No se pudo registrar el detalle de la conformidad ", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                    JOptionPane.showMessageDialog(null, "Se registró correctamente los etalles del acta de conformidad de servicio ", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                    limpiaControles();
                     limpiaTabla();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo registrar correctamente la conformidad de servicio", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        }
        catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null, "Ocurrió un error al registrar la conformidad de servicio " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Vector vec = new Vector();
        vec.addElement(this.txtdescripcion.getText());
        vec.addElement(this.txtobservaciondetalle1.getText());
        vec.addElement(Integer.parseInt(this.spincant.getValue().toString()));
        //float foo = Float.parseFloat(txtpunit.getText());
        //int can = Integer.parseInt(this.spincant.getValue().toString());
        //importexd = can*foo;
        //vec.addElement(importexd);
        dtm2.addRow(vec);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila;
        if(this.tbDetalles.getRowCount()>0){
            fila = this.tbDetalles.getSelectedRow();
            dtm2.removeRow(fila);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void comboOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboOSActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeerActionPerformed

    private void comboResponsablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboResponsablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboResponsablesActionPerformed

    private void comboSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSedeActionPerformed

    private void comboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClientesActionPerformed
       RUCClient =String.valueOf(boPedido.ObtenerCampoTablaGenerico("clientes", "RUC", "nombre", comboClientes.getSelectedItem().toString(),true));
        txtRucCliente.setText(RUCClient);
    }//GEN-LAST:event_comboClientesActionPerformed

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

    private void txtFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolioActionPerformed

    private void btnprotocoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprotocoloActionPerformed
         //Crear la instancia
      ProtocoloCampoView proto =new ProtocoloCampoView();
      MDIApplication.escritorio.add(proto);
      proto.setVisible(true);
      proto.toFront();
        //this.toBack();
    }//GEN-LAST:event_btnprotocoloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportarPDF;
    private com.toedter.calendar.JDateChooser btnFechaRecepcion;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnprotocolo;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JComboBox<String> comboOS;
    private javax.swing.JComboBox<String> comboResponsables;
    private javax.swing.JComboBox<String> comboSede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblObservacion;
    private javax.swing.JLabel lblSede;
    private javax.swing.JLabel lblSede1;
    private javax.swing.JSpinner spincant;
    private javax.swing.JTable tbDetalles;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtNombreResponable;
    private javax.swing.JTextField txtRucCliente;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtobservaciondetalle1;
    // End of variables declaration//GEN-END:variables
}


   





