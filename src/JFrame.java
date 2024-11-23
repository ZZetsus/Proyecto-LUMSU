
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class JFrame extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    Usuario User[] = new Usuario[20];
    int user_Num = 0;
    int rank = 0;
    int botellas_recicladas = 0;
    String cad = "";

    public JFrame() {
        this.setResizable(false);
        this.setContentPane(fondo);
        initComponents();
        jFrame1.getContentPane().setBackground(Color.LIGHT_GRAY);
        jFrame1.setLocationRelativeTo(null);
        jFrame2.getContentPane().setBackground(Color.LIGHT_GRAY);
        jFrame2.setLocationRelativeTo(null);
        jFrame3.getContentPane().setBackground(Color.LIGHT_GRAY);
        jFrame3.setLocationRelativeTo(null);
        jFrame4.getContentPane().setBackground(Color.LIGHT_GRAY);
        jFrame4.setLocationRelativeTo(null);
        jFrame5.getContentPane().setBackground(Color.LIGHT_GRAY);
        jFrame5.setLocationRelativeTo(null);
        jFrame6.getContentPane().setBackground(Color.LIGHT_GRAY);
        jFrame6.setLocationRelativeTo(null);
        jFrame7.getContentPane().setBackground(Color.LIGHT_GRAY);
        jFrame7.setLocationRelativeTo(null);
    }

    public void comprobar() {
        cad = "";
        int i = 0, a = 0;
        if (txtNombre.getText().equals("")) {
            cad += "Campo ´Nombre´vacío \n";
            i++;
        }
        if (txtID.getText().equals("")) {
            cad += "Campo ´ID´vacío \n";
            i++;
        } else {
            int z = 0;
            while (z < user_Num) {
                if (User[z].getID() == Integer.parseInt(txtID.getText())) {
                    cad += "Se encontró un usuario con este ID. \n";
                    i++;
                } else {
                    a = 1;
                }
                z++;
            }
        }
        if (txtTelefono.getText().equals("")) {
            cad += "Campo ´Telefono´vacío \n";
            i++;
        }
        if (txtContraseña1.getText().equals("") || txtContraseña2.getText().equals("")) {
            cad += "Campo(s) ´Contraseña´vacío \n";
            i++;
        } else if (txtContraseña1.getText().equals(txtContraseña2.getText())) {
            a++;
        } else {
            cad += "Las contraseñas no coinciden. \n";
            i++;
        }
        if (chkTerminos.isSelected() == true) {
            a++;
        } else {
            cad += "Terminos no aceptados. \n";
            i++;
        }
        if (i == 0 && a == 2 && user_Num == 0) {
            CapturaRegistro();
            javax.swing.JOptionPane.showMessageDialog(null, "Usuario Registrado.");
            jFrame1.show(false);
            LimpiarRegistro();
            user_Num++;
        } else if (i == 0 && a == 3) {
            CapturaRegistro();
            javax.swing.JOptionPane.showMessageDialog(null, "Usuario Registrado.");
            jFrame1.show(false);
            LimpiarRegistro();
            user_Num++;
        } else {

            javax.swing.JOptionPane.showMessageDialog(null, cad, "Campos Vacíos", -1);
        }

    }

    public void CapturaRegistro() {
        User[user_Num] = new Usuario(txtNombre.getText(), Integer.parseInt(txtID.getText()),
                Integer.parseInt(txtTelefono.getText()), txtContraseña1.getText());
    }

    public void LimpiarRegistro() {
        txtNombre.setText("");
        txtID.setText("");
        txtTelefono.setText("");
        txtContraseña1.setText("");
        txtContraseña2.setText("");
        chkTerminos.setSelected(false);
    }

    public void ImprimirUser() {
         cad = "USUARIOS\n\n";
        for (int a = 0; a < user_Num; a++) {
            cad += "ID: " + User[a].getID()
                    + "\nNombre: " + User[a].getNombre() + "\nTelefono: " + User[a].getTelefono()
                    + "\nBotellas: " + User[a].getCant_botellas() + "\n======================\n";
        }
        if (!cad.equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, cad);
        }
    }

    public int BuscarUser(int ID) {
        int z = 0;
        while (z < user_Num) {
            if (User[z].getID() == ID) {
                return z;
            }
            z++;
        }

        return -1;
    }

    public void limpiarjFrame2() {
        txtBotellas.setText("");
        txtIdjFrame2.setText("");
    }

    public void txtActuFalse() {
        txtNombreActu.setEnabled(false);
        txtTelefonoActu.setEnabled(false);
    }

    public void txtActuTrue() {
        txtNombreActu.setEnabled(true);
        txtTelefonoActu.setEnabled(true);
    }

    public void txtActuComplete(int pos) {
        String ID = String.valueOf(User[pos].getID());
        txtIDActu.setText(ID);
        txtNombreActu.setText(User[pos].getNombre());
        String Telefono = String.valueOf(User[pos].getTelefono());
        txtTelefonoActu.setText(Telefono);
    }

    public int mayor() {
        int mayor = User[0].getCant_botellas();
        for (int ei = 1; ei < user_Num; ei++) {
            if (mayor < User[ei].getCant_botellas()) {
                mayor = User[ei].getCant_botellas();
                pos = ei;
            }
        }
        return pos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContraseña1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtContraseña2 = new javax.swing.JPasswordField();
        chkTerminos = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jFrame2 = new javax.swing.JFrame();
        txtIdjFrame2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBotellas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bntReciclarjFrame2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        txtIDActu = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreActu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelefonoActu = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnActualizarActu = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jFrame4 = new javax.swing.JFrame();
        txtIDContra = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnAceptarContra = new javax.swing.JButton();
        btnCancelarContra = new javax.swing.JButton();
        txtContraseña1Contra = new javax.swing.JPasswordField();
        txtContraseña2Contra = new javax.swing.JPasswordField();
        jFrame5 = new javax.swing.JFrame();
        txtContraseñaRedi = new javax.swing.JPasswordField();
        txtIDRedi = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        LabelBotellas = new javax.swing.JLabel();
        btnIniciarRedi = new javax.swing.JButton();
        LabelMinutos = new javax.swing.JLabel();
        txtTiempoRedi = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnRedimirRedi = new javax.swing.JButton();
        jFrame6 = new javax.swing.JFrame();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtIDRein = new javax.swing.JTextField();
        txtContraseñaRein = new javax.swing.JPasswordField();
        btnReiniciarRein = new javax.swing.JButton();
        btnIniciarRein = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnImprimir1 = new javax.swing.JButton();
        jFrame7 = new javax.swing.JFrame();
        txtIDConsu = new javax.swing.JTextField();
        txtContraseConsu = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnConsultarConsu = new javax.swing.JButton();
        btnCancelarConsu = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnReciclar = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnContraseña = new javax.swing.JButton();
        btnRedimir = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnBotellasRecicladas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jFrame1.setBackground(new java.awt.Color(3, 39, 39));
        jFrame1.setBounds(new java.awt.Rectangle(0, 0, 400, 400));
        jFrame1.setResizable(false);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre: ");

        jLabel4.setText("ID: ");

        jLabel5.setText("Telefono: ");

        jLabel6.setText("Contraseña: ");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        chkTerminos.setText("Acepta los terminos");

        jButton3.setText("Términos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkTerminos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContraseña1)
                            .addComponent(txtContraseña2)
                            .addComponent(txtTelefono)
                            .addComponent(txtID)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(chkTerminos)
                .addGap(29, 29, 29)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jFrame2.setBounds(new java.awt.Rectangle(0, 0, 335, 335));
        jFrame2.setResizable(false);

        jLabel7.setText("Cédula: ");

        jLabel8.setText("Botellas: ");

        bntReciclarjFrame2.setText("Reciclar");
        bntReciclarjFrame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntReciclarjFrame2ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText("RECICLAR");

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(bntReciclarjFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButton4))
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBotellas)
                                .addComponent(txtIdjFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdjFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBotellas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntReciclarjFrame2)
                    .addComponent(jButton4))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jFrame3.setBounds(new java.awt.Rectangle(0, 0, 350, 400));
        jFrame3.setResizable(false);

        txtIDActu.setEnabled(false);

        jLabel10.setText("ID: ");

        jLabel11.setText("Nombre: ");

        jLabel12.setText("Telefono: ");

        jLabel13.setText("Actualizar");

        btnActualizarActu.setText("Actualizar");
        btnActualizarActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActuActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDActu, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtNombreActu)
                            .addComponent(txtTelefonoActu)))
                    .addGroup(jFrame3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnActualizarActu)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDActu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreActu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoActu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarActu)
                    .addComponent(btnBuscar))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jFrame4.setBounds(new java.awt.Rectangle(0, 0, 360, 380));
        jFrame4.setResizable(false);

        txtIDContra.setEnabled(false);

        jLabel14.setText("ID: ");

        jLabel15.setText("Contraseña:");

        jLabel16.setText("Cambio de Contraseña");

        btnAceptarContra.setText("Aceptar");
        btnAceptarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarContraActionPerformed(evt);
            }
        });

        btnCancelarContra.setText("Cancelar");
        btnCancelarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarContraActionPerformed(evt);
            }
        });

        txtContraseña2Contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseña2ContraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame4Layout.createSequentialGroup()
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame4Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnAceptarContra)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarContra))
                    .addGroup(jFrame4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(30, 30, 30)
                        .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDContra)
                            .addComponent(txtContraseña1Contra)
                            .addComponent(txtContraseña2Contra, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                    .addGroup(jFrame4Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtContraseña1Contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContraseña2Contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarContra)
                    .addComponent(btnCancelarContra))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jFrame5.setBounds(new java.awt.Rectangle(0, 0, 350, 475));
        jFrame5.setResizable(false);

        jLabel17.setText("ID: ");

        jLabel18.setText("Contraseña: ");

        jLabel19.setText("Redimir");

        jLabel20.setText("=============================================");

        btnIniciarRedi.setText("Iniciar");
        btnIniciarRedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarRediActionPerformed(evt);
            }
        });

        jLabel21.setText("Tiempo a redimir: ");

        btnRedimirRedi.setText("Redimir");
        btnRedimirRedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedimirRediActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame5Layout = new javax.swing.GroupLayout(jFrame5.getContentPane());
        jFrame5.getContentPane().setLayout(jFrame5Layout);
        jFrame5Layout.setHorizontalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtContraseñaRedi)
                    .addComponent(txtIDRedi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(jFrame5Layout.createSequentialGroup()
                .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelBotellas, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(LabelMinutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jFrame5Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTiempoRedi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame5Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnIniciarRedi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame5Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnRedimirRedi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame5Layout.setVerticalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIDRedi)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseñaRedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(btnIniciarRedi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(60, 60, 60)
                .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTiempoRedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnRedimirRedi)
                .addGap(18, 18, 18)
                .addComponent(LabelMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelBotellas, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jFrame6.setBounds(new java.awt.Rectangle(0, 0, 310, 390));
        jFrame6.setResizable(false);

        jLabel22.setText("ID:");

        jLabel23.setText("Contraseña: ");

        btnReiniciarRein.setText("Reiniciar");
        btnReiniciarRein.setEnabled(false);
        btnReiniciarRein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarReinActionPerformed(evt);
            }
        });

        btnIniciarRein.setText("Iniciar");
        btnIniciarRein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarReinActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel1.setText("ADMINISTRADOR");

        btnImprimir1.setText("Mostrar Usuarios");
        btnImprimir1.setEnabled(false);
        btnImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame6Layout = new javax.swing.GroupLayout(jFrame6.getContentPane());
        jFrame6.getContentPane().setLayout(jFrame6Layout);
        jFrame6Layout.setHorizontalGroup(
            jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame6Layout.createSequentialGroup()
                .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame6Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnIniciarRein, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame6Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1))
                    .addGroup(jFrame6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReiniciarRein, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIDRein)
                                    .addComponent(txtContraseñaRein, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(btnImprimir1)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jFrame6Layout.setVerticalGroup(
            jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDRein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseñaRein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnIniciarRein)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciarRein)
                    .addComponent(btnImprimir1))
                .addGap(66, 66, 66))
        );

        jFrame7.setBounds(new java.awt.Rectangle(0, 0, 310, 280));

        jLabel2.setText("ID:");

        jLabel24.setText("Contraseña: ");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("CONSULTA");

        btnConsultarConsu.setText("Consultar");
        btnConsultarConsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarConsuActionPerformed(evt);
            }
        });

        btnCancelarConsu.setText("Cancelar");
        btnCancelarConsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarConsuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame7Layout = new javax.swing.GroupLayout(jFrame7.getContentPane());
        jFrame7.getContentPane().setLayout(jFrame7Layout);
        jFrame7Layout.setHorizontalGroup(
            jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(jFrame7Layout.createSequentialGroup()
                .addGroup(jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame7Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDConsu)
                            .addComponent(txtContraseConsu, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jFrame7Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnConsultarConsu, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarConsu, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jFrame7Layout.setVerticalGroup(
            jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDConsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtContraseConsu)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarConsu)
                    .addComponent(btnCancelarConsu))
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnregistrar.setText("Registrar Usuario");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnReciclar.setText("Reciclar");
        btnReciclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciclarActionPerformed(evt);
            }
        });

        btnRanking.setText("Ranking");
        btnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnContraseña.setText("Modificar contraseña");
        btnContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContraseñaActionPerformed(evt);
            }
        });

        btnRedimir.setText("Redimir ");
        btnRedimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedimirActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Administrador");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnBotellasRecicladas.setText("Botellas Recicladas");
        btnBotellasRecicladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotellasRecicladasActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBotellasRecicladas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnregistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRanking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReciclar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciar)
                    .addComponent(btnregistrar)
                    .addComponent(btnActualizar))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContraseña)
                    .addComponent(btnRanking)
                    .addComponent(btnReciclar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRedimir)
                    .addComponent(btnBotellasRecicladas)
                    .addComponent(btnConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
        jFrame1.show(true);
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:             
        comprobar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        // TODO add your handling code here:
        if (user_Num != 0) {
            txtIDConsu.setText("");
            txtContraseConsu.setText("");
            jFrame7.show(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios creados");
        }
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnReciclarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciclarActionPerformed
        // TODO add your handling code here:
        if (user_Num != 0) {
            jFrame2.show();
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios creados");
        }
    }//GEN-LAST:event_btnReciclarActionPerformed

    private void bntReciclarjFrame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntReciclarjFrame2ActionPerformed
        // TODO add your handling code here:
        cad = "";
        pos = BuscarUser(Integer.parseInt(txtIdjFrame2.getText()));
        int i = 0;
        if (pos != -1) {
            i++;
        } else {
            cad = "Este ID no está registrado.\n";
        }
        if (Integer.parseInt(txtBotellas.getText()) > 0) {
            i++;
        } else {
            cad += "la cantidad de botellas debe ser mayor que 0.";
        }
        if (i == 2) {
            String[] botones = {"Aceptar", "Cancelar"};
            int ventana = JOptionPane.showOptionDialog(null,
                    "Desea añadir botellas al ID: " + User[pos].getID(),
                    "Reciclar.",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    botones, botones[0]);
            if (ventana == 0) {
                User[pos].setCant_botellas(User[pos].getCant_botellas()
                        + Integer.parseInt(txtBotellas.getText()));
                JOptionPane.showMessageDialog(null, "Botellas Recicladas.");
                rank++;
                botellas_recicladas = botellas_recicladas + Integer.parseInt(txtBotellas.getText());
                User[pos].setMinutos(User[pos].getMinutos() + (Integer.parseInt(txtBotellas.getText()) * 2));
                jFrame2.show(false);
                limpiarjFrame2();
            }

        } else {
            JOptionPane.showMessageDialog(null, cad);
        }

    }//GEN-LAST:event_bntReciclarjFrame2ActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        // TODO add your handling code here:
        if (user_Num != 0) {
            pos = 0;
            if (rank != 0) {
                if (user_Num == 1) {
                    JOptionPane.showMessageDialog(null, "RANKING #1\n==================\nID: " + User[0].getID()
                            + "\nNombre: " + User[0].getNombre() + "\nBotellas: " + User[0].getCant_botellas() + "\n==================");
                } else if (user_Num > 1) {
                    pos = mayor();
                    JOptionPane.showMessageDialog(null, "RANKING #1\n==================\nID: " + User[pos].getID()
                            + "\nNombre: " + User[pos].getNombre() + "\nBotellas: " + User[pos].getCant_botellas() + "\n==================");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vacio");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios creados");
        }
    }//GEN-LAST:event_btnRankingActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if (user_Num != 0) {
            btnActualizarActu.setEnabled(false);
            txtIDActu.setText("");
            txtNombreActu.setText("");
            txtTelefonoActu.setText("");
            txtActuFalse();
            jFrame3.show(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios creados");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed
    int pos;
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:      
        int ID = Integer.parseInt(JOptionPane.showInputDialog("ID a modificar datos"));
        pos = BuscarUser(ID);
        if (pos != -1) {
            JOptionPane.showMessageDialog(null, "Usuario Encontrado.");
            txtActuComplete(pos);
            txtActuTrue();
            btnActualizarActu.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario NO Encontrado.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActuActionPerformed
        // TODO add your handling code here:
        User[pos].setNombre(txtNombreActu.getText());
        User[pos].setTelefono(Integer.parseInt(txtTelefonoActu.getText()));
        JOptionPane.showMessageDialog(null, "Usuario Modificado.");
        jFrame3.show(false);
    }//GEN-LAST:event_btnActualizarActuActionPerformed

    private void btnContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContraseñaActionPerformed
        // TODO add your handling code here:
        if (user_Num != 0) {
            int ID = Integer.parseInt(JOptionPane.showInputDialog("ID a modificar datos"));
            pos = BuscarUser(ID);
            if (pos != -1) {
                String contra = JOptionPane.showInputDialog("Introduzca su contraseña: ");
                if (contra.equals(User[pos].getContraseña())) {
                    String id = String.valueOf(User[pos].getID());
                    txtIDContra.setText(id);
                    jFrame4.show(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ID NO encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios creados");
        }
    }//GEN-LAST:event_btnContraseñaActionPerformed

    private void btnAceptarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarContraActionPerformed
        // TODO add your handling code here:
        if (txtContraseña1Contra.getText().equals(txtContraseña2Contra.getText())) {
            User[pos].setContraseña(txtContraseña1Contra.getText());
            JOptionPane.showMessageDialog(null, "Contraseña Modificada.");
            jFrame4.show(false);
            txtIDContra.setText("");
            txtContraseña1Contra.setText("");
            txtContraseña2Contra.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Las Contraseñas no coinciden.");
        }
    }//GEN-LAST:event_btnAceptarContraActionPerformed

    private void txtContraseña2ContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseña2ContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseña2ContraActionPerformed

    private void btnCancelarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarContraActionPerformed
        // TODO add your handling code here:
        jFrame4.show(false);
        txtIDContra.setText("");
        txtContraseña1Contra.setText("");
        txtContraseña2Contra.setText("");
    }//GEN-LAST:event_btnCancelarContraActionPerformed

    private void btnRedimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedimirActionPerformed
        // TODO add your handling code here:
        if (user_Num != 0) {
            txtIDRedi.setText("");
            txtContraseñaRedi.setText("");
            txtTiempoRedi.setText("");
            LabelMinutos.setText("");
            LabelBotellas.setText("");
            txtIDRedi.setEnabled(true);
            txtContraseñaRedi.setEnabled(true);
            btnIniciarRedi.setEnabled(true);
            txtTiempoRedi.setEnabled(false);
            btnRedimirRedi.setEnabled(false);
            jFrame5.show(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios creados.");
        }
    }//GEN-LAST:event_btnRedimirActionPerformed

    private void btnIniciarRediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarRediActionPerformed
        // TODO add your handling code here:
        pos = BuscarUser(Integer.parseInt(txtIDRedi.getText()));
        if (pos != -1) {
            if (User[pos].getContraseña().equals(txtContraseñaRedi.getText())) {
                if (User[pos].getMinutos() != 0) {
                    JOptionPane.showMessageDialog(null, "sesion iniciada como : " + txtIDRedi.getText());
                    txtIDRedi.setEnabled(false);
                    txtContraseñaRedi.setEnabled(false);
                    btnIniciarRedi.setEnabled(false);
                    txtTiempoRedi.setEnabled(true);
                    btnRedimirRedi.setEnabled(true);
                    LabelBotellas.setText("Cantidad de botellas: " + User[pos].getCant_botellas());
                    LabelMinutos.setText("Minutos: " + User[pos].getMinutos());
                } else {
                    JOptionPane.showMessageDialog(null, "Este usuario no tiene tiempo para redimir.");
                    jFrame5.show(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña es incorrecta.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay un usuario creado con esta ID.");
        }
    }//GEN-LAST:event_btnIniciarRediActionPerformed

    private void btnRedimirRediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedimirRediActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(txtTiempoRedi.getText()) > 0 && Integer.parseInt(txtTiempoRedi.getText()) <= User[pos].getMinutos()) {
            JOptionPane.showMessageDialog(null, "El tiempo ha sido redimido.");
            User[pos].setMinutos(User[pos].getMinutos() - Integer.parseInt(txtTiempoRedi.getText()));
            jFrame5.show(false);
        } else if (Integer.parseInt(txtTiempoRedi.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "El valor ingresado es invalido.");
        } else {
            JOptionPane.showMessageDialog(null, "Su tiempo ingresado excede el tiempo que tienes.");
        }
    }//GEN-LAST:event_btnRedimirRediActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        txtIDRein.setEnabled(true);
        txtContraseñaRein.setEnabled(true);
        btnIniciarRein.setEnabled(true);
        btnReiniciarRein.setEnabled(false);
        btnImprimir1.setEnabled(false);
        txtIDRein.setText("");
        txtContraseñaRein.setText("");
        jFrame6.show(true);

    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnIniciarReinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarReinActionPerformed
        // TODO add your handling code here:

        if (txtIDRein.getText().equals("13112021") && txtContraseñaRein.getText().equals("15112021")) {
            txtIDRein.setEnabled(false);
            txtContraseñaRein.setEnabled(false);
            btnIniciarRein.setEnabled(false);
            btnReiniciarRein.setEnabled(true);
            btnImprimir1.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Acceso concedido.");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado.");
        }
    }//GEN-LAST:event_btnIniciarReinActionPerformed

    private void btnReiniciarReinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarReinActionPerformed
        // TODO add your handling code here:
        if (user_Num != 0) {
            if (rank != 0) {
                pos = mayor();
                rank = 0;
                for (int i = 0; i < user_Num; i++) {
                    User[i].setCant_botellas(0);
                }
                JOptionPane.showMessageDialog(null, "Ranking reiniciado.");
                User[pos].setMinutos(User[pos].getMinutos() + 60);
                jFrame6.show(false);
            } else {
                JOptionPane.showMessageDialog(null, "Premio no entregado");
                jFrame6.show(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios creados");
            jFrame6.show(false);
        }

    }//GEN-LAST:event_btnReiniciarReinActionPerformed

    private void btnBotellasRecicladasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotellasRecicladasActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, botellas_recicladas, "Acumulado por todos los usuarios", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnBotellasRecicladasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Le informamos que con el fin de prestarle una mejor atención e informarle acerca de nuestros servicios" + "\n para facilitarle el acceso a transporte publico, queremos continuar con la opción de comunicarnos con" + "\n usted en forma eficiente." + "\n\n Para proceder de esta manera,le manifestamos que sus datos personales se encuentran incluidos en" + "\n nuestras bases de datos." + "\n\n Según nuestras políticas de tratamiento de datos personales, los mecanismos a través de los cuales" + "\n hacemos uso de éstos son seguros y confidenciales, pues contamos con los medios tecnológicos" + "\n idóneos para asegurar que sean almacenados de manera tal que se impida el acceso indeseado por" + "\nparte de terceras personas, y en ese mismo orden aseguramos la confidencialidad de los mismos.", "Términos y condiciones", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir1ActionPerformed
        // TODO add your handling code here:
        if (user_Num != 0) {
            ImprimirUser();
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios creados");
        }
    }//GEN-LAST:event_btnImprimir1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jFrame2.show(false);
        limpiarjFrame2();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnConsultarConsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarConsuActionPerformed
        // TODO add your handling code here:
        pos = BuscarUser(Integer.parseInt(txtIDConsu.getText()));
        if (pos != -1) {
            if (User[pos].getContraseña().equals(txtContraseConsu.getText())) {
                JOptionPane.showMessageDialog(null, "======================\nID: " + User[pos].getID()
                        + "\nNombre: " + User[pos].getNombre() + "\nTelefono: " + User[pos].getTelefono()
                        + "\nBotellas: " + User[pos].getCant_botellas() + "\n======================\n");
                jFrame7.show(false);
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay un usuario creado con esta ID.");
        }
    }//GEN-LAST:event_btnConsultarConsuActionPerformed

    private void btnCancelarConsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarConsuActionPerformed
        // TODO add your handling code here:
        jFrame7.show(false);
    }//GEN-LAST:event_btnCancelarConsuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBotellas;
    private javax.swing.JLabel LabelMinutos;
    private javax.swing.JButton bntReciclarjFrame2;
    private javax.swing.JButton btnAceptarContra;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarActu;
    private javax.swing.JButton btnBotellasRecicladas;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarConsu;
    private javax.swing.JButton btnCancelarContra;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnConsultarConsu;
    private javax.swing.JButton btnContraseña;
    private javax.swing.JButton btnImprimir1;
    private javax.swing.JButton btnIniciarRedi;
    private javax.swing.JButton btnIniciarRein;
    private javax.swing.JButton btnRanking;
    private javax.swing.JButton btnReciclar;
    private javax.swing.JButton btnRedimir;
    private javax.swing.JButton btnRedimirRedi;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnReiniciarRein;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JCheckBox chkTerminos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JFrame jFrame6;
    private javax.swing.JFrame jFrame7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBotellas;
    private javax.swing.JPasswordField txtContraseConsu;
    private javax.swing.JPasswordField txtContraseña1;
    private javax.swing.JPasswordField txtContraseña1Contra;
    private javax.swing.JPasswordField txtContraseña2;
    private javax.swing.JPasswordField txtContraseña2Contra;
    private javax.swing.JPasswordField txtContraseñaRedi;
    private javax.swing.JPasswordField txtContraseñaRein;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDActu;
    private javax.swing.JTextField txtIDConsu;
    private javax.swing.JTextField txtIDContra;
    private javax.swing.JTextField txtIDRedi;
    private javax.swing.JTextField txtIDRein;
    private javax.swing.JTextField txtIdjFrame2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreActu;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoActu;
    private javax.swing.JTextField txtTiempoRedi;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/Principal.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);

        }

    }

}
