package app.modconta.view;
import app.modconta.databaase.Helper;
import app.modconta.databaase.util;
import app.modconta.entity.DetalleServicio;
import MODEL.EquipoDAO;
import MODEL.ServicioDAO;
import MODEL.VentaDAO;
import MODEL.detserDAO;
import app.modconta.business.Negocios;
import app.modconta.entity.Constantes;
import app.modconta.entity.DetallePedido;
import app.modconta.entity.Grupos_MA;
import app.modconta.entity.Pedido;
import app.modconta.entity.ProtocoloPrueba;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class ProtocoloCampoView extends javax.swing.JInternalFrame 
{
      //variables  
    EquipoDAO eqx = new EquipoDAO();
    ServicioDAO ServicioDAO;
    detserDAO detserDAO;
    VentaDAO vaux;
    Grupos_MA grupo =  new Grupos_MA();
    
    Negocios boPedido;
    
    DefaultTableModel dtm2;
    boolean sw = false;
    String cad = "";
    //int idClie; 
    Helper h = new Helper();
    
    public ProtocoloCampoView() 
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
        comboClientes.setModel(boPedido.getvaluesName("nombre", "clientes"));
        comboGrupos.setModel(boPedido.getvaluesName("codigo", "grupo_ma"));
       //comboClientes.setModel(h.getvaluesTienda("Tienda"));
         AutoCompleteDecorator.decorate(comboClientes);
         dtm2 = (DefaultTableModel)tbPruebaConCarga.getModel();
        //dtm2 = (DefaultTableModel)jTable1.getModel();
       //llenaTabla(false, "");
    }

      //Método de validación
       public boolean valida()
      {
           if(this.txtFolio.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Debe Ingresar N° Folio deprotocolo de prueba de campo");
           return false;
          }

          if(this.txtFolio.getText().length()> Constantes.MAX_TAMAMO_FOLIO)
          {
          JOptionPane.showMessageDialog(null, "El folio no debe exceder " + String.valueOf(Constantes.MAX_TAMAMO_FOLIO) + " caracteres" , "VALIDACION", JOptionPane.WARNING_MESSAGE);
          return false;
          }
         if(dtm2.getRowCount()<=0)
        {
        JOptionPane.showMessageDialog(this, "No existen datos de rpueba para  el protoclo de prueba  N°"+ txtFolio.getText()+ ". Por favor, debe ingresar TODOS los datos...");
        return false;
        }
        
        return true;
      }

     

    //MÉTODO PARA LIMPIAR CONTROLES 
    public void limpiaControles()
     {
        this.txtRuc1.setText("");   
        //this.txtPlantel.setText("");
        this.btnRegistrar.setText("Registrar");
       //   this.txtNombre.requestFocus();
     }
 
    public void limpiaTabla()
    {
        DefaultTableModel dm = (DefaultTableModel)this.tbPruebaConCarga.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnFechaEntrega = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        comboGrupos = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbPruebaConCarga = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtRuc1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboClientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        txtMarcaMotor = new javax.swing.JTextField();
        lblObservacion = new javax.swing.JLabel();
        btnLeer = new javax.swing.JButton();
        lblObservacion1 = new javax.swing.JLabel();
        txtMarcaAlternador = new javax.swing.JTextField();
        txtCodMotor = new javax.swing.JTextField();
        txtHorometro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecomendacion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtCodAlternador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPanelControl = new javax.swing.JTextField();
        txtVoltaje = new javax.swing.JTextField();
        txtHz = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPotencia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTipoGob = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblVoltaje = new javax.swing.JLabel();
        lblTemperaturaMotor = new javax.swing.JLabel();
        lblPresionAceite = new javax.swing.JLabel();
        lblMedidorCom = new javax.swing.JLabel();
        txtVoltajeBateria = new javax.swing.JTextField();
        txtTempeMotor = new javax.swing.JTextField();
        txtMedidorComb = new javax.swing.JTextField();
        txtPresion = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnExportarPDF = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("PROTOCOLO DE PRUEBA EN CAMPO");

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));

        jPanel4.setLayout(null);

        btnFechaEntrega.setDate(Calendar.getInstance().getTime());
        btnFechaEntrega.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(btnFechaEntrega);
        btnFechaEntrega.setBounds(320, 20, 130, 20);

        jLabel5.setText("Fecha ");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(280, 20, 50, 20);

        comboGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGruposActionPerformed(evt);
            }
        });
        jPanel4.add(comboGrupos);
        comboGrupos.setBounds(80, 80, 90, 22);

        tbPruebaConCarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A - B", null, null, null},
                {"B - C", null, null, null},
                {"C - D", null, null, null}
            },
            new String [] {
                "FASE", "HZ", "V", "AMP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbPruebaConCarga);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(30, 300, 240, 80);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar);
        btnLimpiar.setBounds(570, 50, 120, 25);

        jLabel9.setText("Grupo");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(30, 80, 50, 16);
        jPanel4.add(txtRuc1);
        txtRuc1.setBounds(360, 50, 140, 22);

        jLabel10.setText("Cliente");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(30, 50, 100, 20);

        comboClientes.setEditable(true);
        comboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClientesActionPerformed(evt);
            }
        });
        jPanel4.add(comboClientes);
        comboClientes.setBounds(80, 50, 270, 22);

        jLabel2.setText("Código");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(30, 20, 50, 16);
        jPanel4.add(txtFolio);
        txtFolio.setBounds(80, 20, 150, 22);
        jPanel4.add(txtMarcaMotor);
        txtMarcaMotor.setBounds(120, 260, 80, 22);

        lblObservacion.setText("Motor");
        jPanel4.add(lblObservacion);
        lblObservacion.setBounds(50, 260, 70, 16);

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });
        jPanel4.add(btnLeer);
        btnLeer.setBounds(570, 20, 120, 25);

        lblObservacion1.setText("Alternador");
        jPanel4.add(lblObservacion1);
        lblObservacion1.setBounds(40, 230, 60, 16);
        jPanel4.add(txtMarcaAlternador);
        txtMarcaAlternador.setBounds(120, 230, 80, 22);
        jPanel4.add(txtCodMotor);
        txtCodMotor.setBounds(220, 260, 190, 22);
        jPanel4.add(txtHorometro);
        txtHorometro.setBounds(420, 180, 190, 22);

        jLabel1.setText("Recomendaciones");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(30, 440, 103, 16);

        txtRecomendacion.setColumns(20);
        txtRecomendacion.setRows(5);
        jScrollPane1.setViewportView(txtRecomendacion);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(150, 430, 620, 100);

        jLabel3.setText("HZ");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(370, 150, 30, 20);
        jPanel4.add(txtCodAlternador);
        txtCodAlternador.setBounds(220, 230, 190, 22);

        jLabel4.setText("Tipo panel control");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(30, 180, 110, 16);

        jLabel6.setText("Voltaje");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(360, 120, 60, 16);

        jLabel7.setText("Horómetro");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(340, 180, 70, 20);

        txtPanelControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPanelControlActionPerformed(evt);
            }
        });
        jPanel4.add(txtPanelControl);
        txtPanelControl.setBounds(140, 180, 190, 22);
        jPanel4.add(txtVoltaje);
        txtVoltaje.setBounds(420, 120, 190, 22);
        jPanel4.add(txtHz);
        txtHz.setBounds(420, 150, 190, 22);

        jLabel8.setText("Potencia");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 120, 60, 16);

        txtPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotenciaActionPerformed(evt);
            }
        });
        jPanel4.add(txtPotencia);
        txtPotencia.setBounds(140, 120, 190, 22);

        jLabel11.setText("Tipo de gob.");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(30, 150, 90, 16);

        txtTipoGob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoGobActionPerformed(evt);
            }
        });
        jPanel4.add(txtTipoGob);
        txtTipoGob.setBounds(140, 150, 190, 22);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Indicadores de motor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setToolTipText("");

        lblVoltaje.setText("Voltaje de batería");

        lblTemperaturaMotor.setText("Temperatura de motor");

        lblPresionAceite.setText("Presión de aceite");

        lblMedidorCom.setText("Medidor de combustible");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVoltaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtVoltajeBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTemperaturaMotor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPresionAceite, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMedidorCom, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPresion, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txtTempeMotor)
                            .addComponent(txtMedidorComb))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVoltaje)
                    .addComponent(txtVoltajeBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperaturaMotor)
                    .addComponent(txtTempeMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPresionAceite)
                    .addComponent(txtPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedidorCom)
                    .addComponent(txtMedidorComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1);
        jPanel1.setBounds(430, 220, 340, 190);

        jTabbedPane1.addTab("Registrar Protocolos ", jPanel4);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExportarPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(336, 336, 336))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExportarPDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir)
                        .addGap(0, 474, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
            ProtocoloPrueba p = new ProtocoloPrueba();
            idClient = boPedido.ObtenerCampoTablaGenerico("clientes", "idcliente", "nombre", comboClientes.getSelectedItem().toString(),true);
            p.setCodigo((txtFolio.getText()));
            p.setNombre_cliente( comboClientes.getSelectedItem().toString());
            //JOptionPane.showMessageDialog(null, "probando...", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
            p.setA11(dtm2.getValueAt(0,1).toString().trim());
            //JOptionPane.showMessageDialog(null,dtm2.getValueAt(1, 0).toString().trim(), "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
            p.setA12(dtm2.getValueAt(0, 2).toString().trim());
                // JOptionPane.showMessageDialog(null,dtm2.getValueAt(1, 1).toString().trim(), "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
            p.setA13(dtm2.getValueAt(0, 3).toString().trim());
                // JOptionPane.showMessageDialog(null,dtm2.getValueAt(1, 2).toString().trim(), "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
            p.setA21(dtm2.getValueAt(1,1).toString().trim());
                 //JOptionPane.showMessageDialog(null,dtm2.getValueAt(2, 0).toString().trim(), "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
            p.setA22(dtm2.getValueAt(1,2).toString().trim());
                 //JOptionPane.showMessageDialog(null,dtm2.getValueAt(2, 1).toString().trim(), "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
            p.setA23(dtm2.getValueAt(1,3).toString().trim());
                 //JOptionPane.showMessageDialog(null,dtm2.getValueAt(2, 2).toString().trim(), "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
//                p.setA31(dtm2.getValueAt(2, 1).toString().trim());
//                     //JOptionPane.showMessageDialog(null,dtm2.getValueAt(1, 1).toString().trim(), "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
//                p.setA32(dtm2.getValueAt(2, 2).toString().trim());
//                     //JOptionPane.showMessageDialog(null,dtm2.getValueAt(1, 1).toString().trim(), "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
//                p.setA33(dtm2.getValueAt(2, 3).toString().trim());
                 //JOptionPane.showMessageDialog(null,dtm2.getValueAt(1, 1).toString().trim(), "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
           //p.setIdCliente(idClient);
           //p.setFolio(txtFolio.getText());
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
            if(boPedido.RegistrarProtocolo(p) == true)
            {
              
                    JOptionPane.showMessageDialog(null, "Se registraron los registros correctamente", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                    limpiaControles();
                     limpiaTabla();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo registrar correctamente el pedido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        }
        catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null, "Ocurrió un error al registrar " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
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

    private void comboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClientesActionPerformed

    private void comboGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGruposActionPerformed
        //comboGrupos.setEnabled(true);
        grupo = new Grupos_MA();
        grupo =  LeerDatosGrupo(comboGrupos.getSelectedItem().toString());  
        txtPotencia.setText(grupo.getPotencia());
        txtMarcaMotor.setText(grupo.getMarcaMotor());
        txtMarcaAlternador.setText(grupo.getMarcaAlternador());
        txtVoltaje.setText(grupo.getVoltaje());
        txtHz.setText(grupo.getHZ());
        txtHorometro.setText(grupo.getHorometro());
        txtCodAlternador.setText(grupo.getSerieAlternador());
        txtCodMotor.setText(grupo.getSerieMotor());
        txtTipoGob.setText(grupo.getTip_gobernacion());
        txtPanelControl.setText(grupo.getPanel_control());
        
        //comboEquipos.setModel(h.getvaluesEqVe(Integer.parseInt(comboGrupos.getSelectedItem().toString())));
    }//GEN-LAST:event_comboGruposActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        
    }//GEN-LAST:event_btnLeerActionPerformed

    private void txtPanelControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPanelControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPanelControlActionPerformed

    private void txtPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPotenciaActionPerformed

    private void txtTipoGobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoGobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoGobActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportarPDF;
    private com.toedter.calendar.JDateChooser btnFechaEntrega;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JComboBox<String> comboGrupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblMedidorCom;
    private javax.swing.JLabel lblObservacion;
    private javax.swing.JLabel lblObservacion1;
    private javax.swing.JLabel lblPresionAceite;
    private javax.swing.JLabel lblTemperaturaMotor;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVoltaje;
    private javax.swing.JTable tbPruebaConCarga;
    private javax.swing.JTextField txtCodAlternador;
    private javax.swing.JTextField txtCodMotor;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtHorometro;
    private javax.swing.JTextField txtHz;
    private javax.swing.JTextField txtMarcaAlternador;
    private javax.swing.JTextField txtMarcaMotor;
    private javax.swing.JTextField txtMedidorComb;
    private javax.swing.JTextField txtPanelControl;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtPresion;
    private javax.swing.JTextArea txtRecomendacion;
    private javax.swing.JTextField txtRuc1;
    private javax.swing.JTextField txtTempeMotor;
    private javax.swing.JTextField txtTipoGob;
    private javax.swing.JTextField txtVoltaje;
    private javax.swing.JTextField txtVoltajeBateria;
    // End of variables declaration//GEN-END:variables

    private Grupos_MA LeerDatosGrupo(String codigo) {
      
   try {
            return boPedido.LeerDatosGrupo(codigo);
        } catch (Exception e) 
        {
              JOptionPane.showMessageDialog(null, "Ocurrió un error al registrar " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
              throw e;
        }
    }
}


   





