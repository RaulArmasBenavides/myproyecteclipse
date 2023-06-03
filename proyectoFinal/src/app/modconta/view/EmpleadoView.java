package app.modconta.view;
import app.modconta.databaase.dbBean;
import app.modconta.databaase.util;
import app.modconta.entity.Contrato;
import app.modconta.entity.Empleado;
import MODEL.ContratoDAO;
import MODEL.EmpleadoDAO;
import static java.lang.Float.parseFloat;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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

public class EmpleadoView extends javax.swing.JInternalFrame {
     //variables  
    EmpleadoDAO EmpleadoDAO;
    ContratoDAO ContratoDAO;
    DefaultTableModel dtm;
    boolean sw = false;
    String cad = "";
    int idEmp; 
    
   
    public EmpleadoView() {
        EmpleadoDAO = new EmpleadoDAO();
        ContratoDAO = new ContratoDAO();
        util utile = new util();
        initComponents();
        this.dcFechaIncio.setEnabled(true);
        this.dcFechaFin.setEnabled(true);
        dtm = (DefaultTableModel)tblCliente.getModel();
        llenaTabla(false, "");
        int idx = utile.idNext("Empleado", "idEmpleado");
        int xstring=idx;
        this.idint.setText(Integer.toString(xstring));
       
    }
   
    public void llenaTabla(boolean swr, String cadr)
    {
        Vector<Empleado> persot = EmpleadoDAO.ListaItem(swr, cadr);
        int i = persot.size(); 
        for(int j = 0; j<i;j++){
            Vector vect = new Vector();
            vect.addElement(persot.get(j).getIdEmpleado());
            vect.addElement(persot.get(j).getCodigoContrato());
            vect.addElement(persot.get(j).getNombre());
            vect.addElement(persot.get(j).getApellidos());
            vect.addElement(persot.get(j).getSexo());
            vect.addElement(persot.get(j).getTelefono());
            vect.addElement(persot.get(j).getDNI());
            vect.addElement(persot.get(j).getDireccion());
            
            dtm.addRow(vect);
        }
    } 
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtnM = new javax.swing.JRadioButton();
        rbtnF = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        idint = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtSueldo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dcFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dcFechaIncio = new com.toedter.calendar.JDateChooser();
        cbxCargo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbxArea = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnRegistrarContrato = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        txtcodigoempleado = new javax.swing.JTextField();
        idint2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("::EMPLEADO_FRM::");
        setAutoscrolls(true);

        jButton1.setText("Generar Reporte Empleados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel3.setText("Nombre");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(30, 60, 60, 14);

        jLabel4.setText("Apellidos");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(30, 100, 60, 20);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });
        jPanel4.add(txtNombre);
        txtNombre.setBounds(130, 50, 330, 30);

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
        });
        jPanel4.add(txtApellidos);
        txtApellidos.setBounds(130, 90, 330, 30);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar);
        btnLimpiar.setBounds(500, 110, 80, 40);

        jLabel6.setText("DNI");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(40, 140, 50, 10);

        btnRegistrar.setText("Registrar");
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
        jPanel4.add(btnRegistrar);
        btnRegistrar.setBounds(500, 40, 80, 60);

        txtDNI.setName("txtDireccion"); // NOI18N
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        jPanel4.add(txtDNI);
        txtDNI.setBounds(130, 130, 110, 30);

        jLabel7.setText("Celular");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(260, 140, 50, 14);

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel4.add(txtTelefono);
        txtTelefono.setBounds(330, 130, 130, 30);

        jLabel9.setText("Dirección");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(30, 220, 60, 14);
        jPanel4.add(txtDireccion);
        txtDireccion.setBounds(130, 210, 330, 30);
        jPanel4.add(jLabel11);
        jLabel11.setBounds(0, 0, 0, 0);

        jLabel8.setText("Sexo");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(40, 180, 50, 14);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));

        sexo.add(rbtnM);
        rbtnM.setText("Masculino");

        sexo.add(rbtnF);
        rbtnF.setText("Femenino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(rbtnF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnM)
                    .addComponent(rbtnF))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1);
        jPanel1.setBounds(130, 170, 330, 30);

        jLabel13.setText("Código");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(40, 260, 50, 14);
        jPanel4.add(txtCodigo);
        txtCodigo.setBounds(130, 250, 330, 30);

        jLabel16.setText("idEmpleado");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(20, 20, 80, 14);

        idint.setEnabled(false);
        idint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idintActionPerformed(evt);
            }
        });
        jPanel4.add(idint);
        idint.setBounds(130, 10, 50, 30);

        jTabbedPane1.addTab("Registrar", jPanel4);

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel1.setText("Sueldo");

        dcFechaFin.setDate(Calendar.getInstance().getTime());
        dcFechaFin.setDateFormatString("yyyy/MM/dd");
        dcFechaFin.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Fecha de fin");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Fecha de inicio");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        dcFechaIncio.setDate(Calendar.getInstance().getTime());
        dcFechaIncio.setDateFormatString("yyyy/MM/dd");
        dcFechaIncio.setPreferredSize(new java.awt.Dimension(120, 20));

        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JEFE ", "SUPERVISOR ", "TECNICO", "VENDEDOR" }));
        cbxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCargoActionPerformed(evt);
            }
        });

        jLabel10.setText("Cargo");

        cbxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VENTAS", "CONTABILIDAD", "SOPORTE TÉCNICO" }));
        cbxArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAreaActionPerformed(evt);
            }
        });

        jLabel5.setText("Área");

        jLabel15.setText("Código del Empleado");

        btnRegistrarContrato.setText("Registrar");
        btnRegistrarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarContratoActionPerformed(evt);
            }
        });
        btnRegistrarContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRegistrarContratoKeyPressed(evt);
            }
        });

        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        idint2.setEnabled(false);
        idint2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idint2ActionPerformed(evt);
            }
        });

        jLabel17.setText("idEmpleado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFechaIncio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigoempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idint2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxArea, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(idint2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtcodigoempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFechaIncio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarContrato)
                    .addComponent(btnLimpiar1))
                .addGap(199, 199, 199))
        );

        jTabbedPane1.addTab("Contrato", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        jPanel3.setLayout(null);

        jLabel2.setText("Búsqueda");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 30, 60, 20);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Empleado", "Codigo", "Nombre", "Apellidos", "Sexo", "Telefono", "DNI", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCliente.setToolTipText("");
        tblCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 610, 200);

        jTextField1.setName("txtBusqueda"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(230, 20, 300, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Elija el criterio)" }));
        jComboBox3.setToolTipText("");
        jPanel3.add(jComboBox3);
        jComboBox3.setBounds(70, 20, 150, 30);

        jTabbedPane1.addTab("Búsqueda", jPanel3);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MANTENIMIENTO - EMPLEADO");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.gif"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnSalir)
                            .addComponent(jButton2))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x ;
     x = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el codigo del Empleado"));
      try { 
            //creamos un objeto dbBean
              dbBean aux = new dbBean();
              HashMap map = new HashMap();
              //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
              Connection cn = aux.getConnection();
              JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/EmpleadoReporte.jrxml");
              map.put("idEmpleado",x); 
              JasperPrint jp = JasperFillManager.fillReport(jr,map,cn);
            // JasperPrint jp= JasperFillManager.fillReport(jr,idClie,cn);
              
              JasperViewer jv= new JasperViewer(jp,false);
              jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cbxAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAreaActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void btnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrarKeyPressed

    }//GEN-LAST:event_btnRegistrarKeyPressed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        String proc = this.btnRegistrar.getText();
        int id = 0, est;
        String pr = ""; 
        //el formato de la fecha
       // DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
      //   SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        // String strDate = DateFormat.getDateInstance().format(date);
        // Fecha.setText(date);
        if(valida() == true){
            util u = new util();
            Empleado p = new Empleado();
            //Contrato c = new Contrato();
              //CONTRATO
           //  c.setCodigo(this.txtCodigoContrato.getText());
           // c.setArea(this.cbxArea.getSelectedItem().toString());
           // c.setCargo(this.cbxCargo.getSelectedItem().toString());
           // c.setFechaInicio(this.dcFechaIncio.getDate().toString());
           // c.setFechaFinal(this.dcFechaFin.getDate().toString());
           // c.setSueldo(parseFloat(txtSueldo.getText()));
            //EMPLEADO
            p.setNombre(this.txtNombre.getText());
            p.setApellidos(this.txtApellidos.getText());
            if(rbtnM.isSelected())
            p.setSexo(this.rbtnM.getText());
            else if(rbtnF.isSelected())
            p.setSexo(this.rbtnF.getText());
            p.setTelefono(this.txtTelefono.getText());
            p.setDNI(this.txtDNI.getText());
            p.setDireccion(this.txtDireccion.getText());
            p.setCodigoContrato(this.txtCodigo.getText());
         
          // p.setFechaInicio(this.dcFechaIncio.getDate().toString());
           //p.setFechaFinal(this.dcFechaFin.getDate().toString());
           //p.setSueldo(parseFloat(txtSueldo.getText()));         
             //cbxCargo.getModel().setSelectedItem();
           //p.setCargo(this.cbxCargo.getSelectedItem().toString());
            
            //p.setArea(this.cbxArea.getSelectedItem().toString());
             //JOptionPane.showMessageDialog(this, "Area ingresado");
            //p.setFechaFinal(this.dcFechaInicio.getDate()); 
            //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
             //String date = sdf.format(jDateChooser1.getSelectedDate().getTime());
            //jLabel1.setText(date);
            if(proc.equals("Registrar")){
                id = u.idNext("Empleado", "idEmpleado");
                int x=id;
                pr = "insert";
                this.idint.setText(Integer.toString(x+1));
                this.idint2.setText(Integer.toString(x));
                this.txtcodigoempleado.setText(this.txtCodigo.getText());
            }
            if(proc.equals("Actualizar")){
                id = this.idEmp;
                pr = "update";
            }
            p.setIdEmpleado(id);
            
            EmpleadoDAO.procesaItem(p,pr);
            
            System.out.println(id);
            ;
            limpiaControles();
            limpiaTabla();
            llenaTabla(false, "");
            
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // limpiaControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.getFocusOwner().transferFocus();
        }
    }//GEN-LAST:event_txtApellidosKeyPressed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.getFocusOwner().transferFocus();
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        if(evt.getClickCount() == 1){
            this.jTabbedPane1.setSelectedIndex(1);

            //llenaModifica();
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnRegistrarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarContratoActionPerformed
        String proc = this.btnRegistrar.getText();
        int id = 0, est;
        String pr = ""; 
        //el formato de la fecha
       // DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
      //   SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        // String strDate = DateFormat.getDateInstance().format(date);
        // Fecha.setText(date);
        if(valida() == true){
         util u = new util();
           // Empleado p = new Empleado();
            Contrato c = new Contrato();
              //CONTRATO
             c.setIdEmpleado(Integer.parseInt(this.idint2.getText()));
             JOptionPane.showMessageDialog(this, "idEmpleado " + this.idint2.getText());
             c.setIdContrato(this.txtcodigoempleado.getText());
             JOptionPane.showMessageDialog(this, "idContrato" + this.txtcodigoempleado.getText() );
             c.setArea(this.cbxArea.getSelectedItem().toString());
             JOptionPane.showMessageDialog(this, "Area" + this.cbxArea.getSelectedItem().toString());
             c.setCargo(this.cbxCargo.getSelectedItem().toString());
             JOptionPane.showMessageDialog(this, "Cargo" +this.cbxCargo.getSelectedItem().toString() );
            
             //configuramos la fecha de inicio
             String dia_i = Integer.toString(this.dcFechaIncio.getCalendar().get(Calendar.DAY_OF_MONTH));
             String mes_i = Integer.toString(this.dcFechaIncio.getCalendar().get(Calendar.MONTH) + 1);
             String year_i = Integer.toString(this.dcFechaIncio.getCalendar().get(Calendar.YEAR));
             String fecha_i = (year_i + "/" + mes_i+ "/" + dia_i);
             
            //this.dcFechaIncio.etText(fecha_i);
             //String diai = Integer.toString(this.dcFechaIncio.getCalendar().get(Calendar.DAY_OF_MONTH));
            // String mesi = Integer.toString(this.dcFechaFin.getCalendar().get(Calendar.MONTH));
            //String mes = Integer.toString(jdt.getCalendar().get(Calendar.MONTH) + 1);
             //String year = Integer.toString(jdt.getCalendar().get(Calendar.YEAR));
             //String fecha = (year + "-" + mes+ "-" + dia);
             //txtfecha.setText(fecha);
             
             c.setFechaInicio(fecha_i);
             JOptionPane.showMessageDialog(this, "Fehca inicio " + fecha_i);
             
             //configuramos la fecha de inicio
             String dia_f = Integer.toString(this.dcFechaFin.getCalendar().get(Calendar.DAY_OF_MONTH));
             String mes_f = Integer.toString(this.dcFechaFin.getCalendar().get(Calendar.MONTH) + 1);
             String year_f = Integer.toString(this.dcFechaFin.getCalendar().get(Calendar.YEAR));
             String fecha_f = (year_f + "/" + mes_f+ "/" + dia_f);
             
             c.setFechaFinal(fecha_f);
             JOptionPane.showMessageDialog(this, "Fecha fin " + fecha_f);
             c.setSueldo(parseFloat(txtSueldo.getText()));
             JOptionPane.showMessageDialog(this, "todo ");
            //EMPLEADO
            //p.setNombre(this.txtNombre.getText());
            //p.setApellidos(this.txtApellidos.getText());
            //if(rbtnM.isSelected())
            //p.setSexo(this.rbtnM.getText());
            //else if(rbtnF.isSelected())
            //p.setSexo(this.rbtnF.getText());
            //p.setTelefono(this.txtTelefono.getText());
            //p.setDNI(this.txtDNI.getText());
            //p.setDireccion(this.txtDireccion.getText());
            //p.setCodigoContrato(this.txtCodigo.getText());
         
          // p.setFechaInicio(this.dcFechaIncio.getDate().toString());
           //p.setFechaFinal(this.dcFechaFin.getDate().toString());
           //p.setSueldo(parseFloat(txtSueldo.getText()));         
             //cbxCargo.getModel().setSelectedItem();
           //p.setCargo(this.cbxCargo.getSelectedItem().toString());
            
            //p.setArea(this.cbxArea.getSelectedItem().toString());
             //JOptionPane.showMessageDialog(this, "Area ingresado");
            //p.setFechaFinal(this.dcFechaInicio.getDate()); 
            //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
             //String date = sdf.format(jDateChooser1.getSelectedDate().getTime());
            //jLabel1.setText(date);
      
            if(proc.equals("Registrar"))
            {
           //        id = u.idNext("Empleado", "idEmpleado");
          //      int x=id;
                pr = "insert";
            }
            if(proc.equals("Actualizar")){
                
            //    id = this.idEmp;
                pr = "update";
            }
            //p.setIdEmpleado(id);
            
            ContratoDAO.procesaItem(c,pr);
  
           System.out.println(id);
            
            limpiaControles();
            limpiaTabla();
            llenaTabla(false, "");       
    }//GEN-LAST:event_btnRegistrarContratoActionPerformed
 }

    private void btnRegistrarContratoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrarContratoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarContratoKeyPressed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void idintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idintActionPerformed

    private void idint2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idint2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idint2ActionPerformed

    private void cbxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCargoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

 public void limpiaControles(){
        this.txtNombre.setText("");
        this.txtApellidos.setText("");
        this.txtTelefono.setText("");
        this.txtDireccion.setText("");
        this.txtDNI.setText("");
        this.txtCodigo.setText("");
        
        this.btnRegistrar.setText("Registrar");
        this.txtNombre.requestFocus();
        
    }
    public void limpiaTabla(){
        DefaultTableModel dm = (DefaultTableModel)this.tblCliente.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }
    
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
        } */
        return true;
     
    
}
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarContrato;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxArea;
    private javax.swing.JComboBox<String> cbxCargo;
    private com.toedter.calendar.JDateChooser dcFechaFin;
    private com.toedter.calendar.JDateChooser dcFechaIncio;
    private javax.swing.JTextField idint;
    private javax.swing.JTextField idint2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtnF;
    private javax.swing.JRadioButton rbtnM;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtcodigoempleado;
    // End of variables declaration//GEN-END:variables
}
