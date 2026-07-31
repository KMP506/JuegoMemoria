/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import controlador.ControladorJuego;
import modelo.Nivel;

/**
 *
 * @author efrai
 */
public class FrmJuego extends javax.swing.JFrame {
    
   private javax.swing.JButton[] botonesPrincipiante;
  private javax.swing.JButton[] botonesIntermedio;
  private javax.swing.JButton[] botonesAvanzados;
   private ControladorJuego controlador;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmJuego.class.getName());

    /**
     * Creates new form FrmJuego
     */
    public FrmJuego() {
        initComponents();
        
        botonesPrincipiante= new javax.swing.JButton[16];
        
        botonesPrincipiante[0]=btnP1;
        botonesPrincipiante[1]=btnP2;
        botonesPrincipiante[2]=btnP3;
        botonesPrincipiante[3]=btnP4;
        botonesPrincipiante[4]=btnP5;
        botonesPrincipiante[5]=btnP6;
        botonesPrincipiante[6]=btnP7;
        botonesPrincipiante[7]=btnP8;
        botonesPrincipiante[8]=btnP9;
        botonesPrincipiante[9]=btnP10;
        botonesPrincipiante[10]=btnP11;
        botonesPrincipiante[11]=btnP12;
        botonesPrincipiante[12]=btnP13;
        botonesPrincipiante[13]=btnP14;
        botonesPrincipiante[14]=btnP15;
        botonesPrincipiante[15]=btnP16;
         
         botonesIntermedio= new javax.swing.JButton[32];
        
         botonesIntermedio[0]=btnI1;
         botonesIntermedio[1]=btnI2;
         botonesIntermedio[2]=btnI3;
         botonesIntermedio[3]=btnI4;
         botonesIntermedio[4]=btnI5;
         botonesIntermedio[5]=btnI6;
         botonesIntermedio[6]=btnI7;
         botonesIntermedio[7]=btnI8;
         botonesIntermedio[8]=btnI9;
         botonesIntermedio[9]=btnI10;
         botonesIntermedio[10]=btnI11;
         botonesIntermedio[11]=btnI12;
         botonesIntermedio[12]=btnI13;
         botonesIntermedio[13]=btnI14;
         botonesIntermedio[14]=btnI15;
         botonesIntermedio[15]=btnI16;
         botonesIntermedio[16]=btnI17;
         botonesIntermedio[17]=btnI18;
         botonesIntermedio[18]=btnI19;
         botonesIntermedio[19]=btnI20;
         botonesIntermedio[20]=btnI21;
         botonesIntermedio[21]=btnI22;
         botonesIntermedio[22]=btnI23;
         botonesIntermedio[23]=btnI24;
         botonesIntermedio[24]=btnI25;
         botonesIntermedio[25]=btnI26;
         botonesIntermedio[26]=btnI27;
         botonesIntermedio[27]=btnI28;
         botonesIntermedio[28]=btnI29;
         botonesIntermedio[29]=btnI30;
         botonesIntermedio[30]=btnI31;
         botonesIntermedio[31]=btnI32;
     
         botonesAvanzados= new javax.swing.JButton[64];
         
         botonesAvanzados[0]=btnA1;
         botonesAvanzados[1]=btnA2;
         botonesAvanzados[2]=btnA3;
         botonesAvanzados[3]=btnA4;
         botonesAvanzados[4]=btnA5;
         botonesAvanzados[5]=btnA6;
         botonesAvanzados[7]=btnA7;
         botonesAvanzados[8]=btnA8;
         botonesAvanzados[9]=btnA9;
         botonesAvanzados[11]=btnA10;
         botonesAvanzados[12]=btnA11;
         botonesAvanzados[13]=btnA12;
         botonesAvanzados[14]=btnA13;
         botonesAvanzados[15]=btnA14;
         botonesAvanzados[16]=btnA15;
         botonesAvanzados[17]=btnA16;
         botonesAvanzados[18]=btnA17;
         botonesAvanzados[19]=btnA18;
         botonesAvanzados[20]=btnA19;
         botonesAvanzados[21]=btnA20;
         botonesAvanzados[22]=btnA21;
         botonesAvanzados[23]=btnA22;
         botonesAvanzados[24]=btnA23;
         botonesAvanzados[25]=btnA24;
         botonesAvanzados[26]=btnA25;
         botonesAvanzados[27]=btnA26;
         botonesAvanzados[28]=btnA27;
         botonesAvanzados[29]=btnA28;
         botonesAvanzados[30]=btnA29;
         botonesAvanzados[31]=btnA30;
         botonesAvanzados[32]=btnA31;
         botonesAvanzados[33]=btnA32;
         botonesAvanzados[34]=btnA33;
         botonesAvanzados[35]=btnA34;
         botonesAvanzados[36]=btnA35;
         botonesAvanzados[37]=btnA36;
         botonesAvanzados[38]=btnA37;
        
       
         
   
        controlador=new ControladorJuego(Nivel.PRINCIPIANTE,this);
        mostrarTableroSegunNIvel();
       setLocationRelativeTo(null);
       
       
       
       
       
    }
    
    public void mostrarTableroSegunNIvel(){
        int opcion;
        opcion=cmbNivel.getSelectedIndex();
        
        pnlPrincipiante.setVisible(false);
        pnlIntermedio.setVisible(false);
        pnlAvanzado.setVisible(false);
        if(opcion==0){
            pnlPrincipiante.setVisible(true);
        }else if(opcion== 1){
            pnlIntermedio.setVisible(true);
        }else if(opcion==2){
            pnlAvanzado.setVisible(true);
        }
    }
    public void seleccionarCarta(int fila, int columna){
        controlador.seleccionarCarta(fila, columna);  
    }
     public void reiniciarValores() {

    lblPuntajeValor.setText("0");
    lblIntentosValor.setText("0");
    lblParejasValor.setText("0");
    lblTiempoValor.setText("00:00");
}
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlTablero = new javax.swing.JPanel();
        pnlPrincipiante = new javax.swing.JPanel();
        btnP1 = new javax.swing.JButton();
        btnP2 = new javax.swing.JButton();
        btnP3 = new javax.swing.JButton();
        btnP4 = new javax.swing.JButton();
        btnP5 = new javax.swing.JButton();
        btnP6 = new javax.swing.JButton();
        btnP7 = new javax.swing.JButton();
        btnP8 = new javax.swing.JButton();
        btnP9 = new javax.swing.JButton();
        btnP10 = new javax.swing.JButton();
        btnP11 = new javax.swing.JButton();
        btnP12 = new javax.swing.JButton();
        btnP13 = new javax.swing.JButton();
        btnP14 = new javax.swing.JButton();
        btnP15 = new javax.swing.JButton();
        btnP16 = new javax.swing.JButton();
        pnlIntermedio = new javax.swing.JPanel();
        btnI1 = new javax.swing.JButton();
        btnI2 = new javax.swing.JButton();
        btnI3 = new javax.swing.JButton();
        btnI4 = new javax.swing.JButton();
        btnI5 = new javax.swing.JButton();
        btnI6 = new javax.swing.JButton();
        btnI7 = new javax.swing.JButton();
        btnI8 = new javax.swing.JButton();
        btnI9 = new javax.swing.JButton();
        btnI10 = new javax.swing.JButton();
        btnI11 = new javax.swing.JButton();
        btnI12 = new javax.swing.JButton();
        btnI13 = new javax.swing.JButton();
        btnI14 = new javax.swing.JButton();
        btnI15 = new javax.swing.JButton();
        btnI16 = new javax.swing.JButton();
        btnI17 = new javax.swing.JButton();
        btnI18 = new javax.swing.JButton();
        btnI19 = new javax.swing.JButton();
        btnI20 = new javax.swing.JButton();
        btnI21 = new javax.swing.JButton();
        btnI22 = new javax.swing.JButton();
        btnI23 = new javax.swing.JButton();
        btnI24 = new javax.swing.JButton();
        btnI25 = new javax.swing.JButton();
        btnI26 = new javax.swing.JButton();
        btnI27 = new javax.swing.JButton();
        btnI28 = new javax.swing.JButton();
        btnI29 = new javax.swing.JButton();
        btnI30 = new javax.swing.JButton();
        btnI31 = new javax.swing.JButton();
        btnI32 = new javax.swing.JButton();
        pnlAvanzado = new javax.swing.JPanel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnA6 = new javax.swing.JButton();
        btnA7 = new javax.swing.JButton();
        btnA8 = new javax.swing.JButton();
        btnA9 = new javax.swing.JButton();
        btnA10 = new javax.swing.JButton();
        btnA11 = new javax.swing.JButton();
        btnA12 = new javax.swing.JButton();
        btnA13 = new javax.swing.JButton();
        btnA14 = new javax.swing.JButton();
        btnA15 = new javax.swing.JButton();
        btnA16 = new javax.swing.JButton();
        btnA17 = new javax.swing.JButton();
        btnA18 = new javax.swing.JButton();
        btnA19 = new javax.swing.JButton();
        btnA20 = new javax.swing.JButton();
        btnA21 = new javax.swing.JButton();
        btnA22 = new javax.swing.JButton();
        btnA23 = new javax.swing.JButton();
        btnA24 = new javax.swing.JButton();
        btnA25 = new javax.swing.JButton();
        btnA26 = new javax.swing.JButton();
        btnA27 = new javax.swing.JButton();
        btnA28 = new javax.swing.JButton();
        btnA29 = new javax.swing.JButton();
        btnA30 = new javax.swing.JButton();
        btnA31 = new javax.swing.JButton();
        btnA32 = new javax.swing.JButton();
        btnA33 = new javax.swing.JButton();
        btnA34 = new javax.swing.JButton();
        btnA35 = new javax.swing.JButton();
        btnA36 = new javax.swing.JButton();
        btnA37 = new javax.swing.JButton();
        btnA38 = new javax.swing.JButton();
        btnA39 = new javax.swing.JButton();
        btnA40 = new javax.swing.JButton();
        btnA41 = new javax.swing.JButton();
        btnA42 = new javax.swing.JButton();
        btnA43 = new javax.swing.JButton();
        btnA44 = new javax.swing.JButton();
        btnA45 = new javax.swing.JButton();
        btnA46 = new javax.swing.JButton();
        btnA47 = new javax.swing.JButton();
        btnA48 = new javax.swing.JButton();
        btnA49 = new javax.swing.JButton();
        btnA50 = new javax.swing.JButton();
        btnA51 = new javax.swing.JButton();
        btnA52 = new javax.swing.JButton();
        btnA53 = new javax.swing.JButton();
        btnA54 = new javax.swing.JButton();
        btnA55 = new javax.swing.JButton();
        btnA56 = new javax.swing.JButton();
        btnA57 = new javax.swing.JButton();
        btnA58 = new javax.swing.JButton();
        btnA59 = new javax.swing.JButton();
        btnA60 = new javax.swing.JButton();
        btnA61 = new javax.swing.JButton();
        btnA62 = new javax.swing.JButton();
        btnA63 = new javax.swing.JButton();
        btnA64 = new javax.swing.JButton();
        pnlInformacion = new javax.swing.JPanel();
        lblTiempo = new javax.swing.JLabel();
        cmbNivel = new javax.swing.JComboBox<>();
        lblPuntajeValor = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblTiempoValor = new javax.swing.JLabel();
        lblPuntaje = new javax.swing.JLabel();
        lblIntentosValor = new javax.swing.JLabel();
        lblParejas = new javax.swing.JLabel();
        lblParejasValor = new javax.swing.JLabel();
        lblIntentos = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 750));
        setResizable(false);

        pnlTablero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlTablero.setMinimumSize(new java.awt.Dimension(600, 350));
        pnlTablero.setPreferredSize(new java.awt.Dimension(1000, 500));
        pnlTablero.setLayout(new java.awt.CardLayout());

        pnlPrincipiante.setLayout(new java.awt.GridLayout(4, 4));

        btnP1.addActionListener(this::btnP1ActionPerformed);
        pnlPrincipiante.add(btnP1);

        btnP2.addActionListener(this::btnP2ActionPerformed);
        pnlPrincipiante.add(btnP2);

        btnP3.addActionListener(this::btnP3ActionPerformed);
        pnlPrincipiante.add(btnP3);

        btnP4.addActionListener(this::btnP4ActionPerformed);
        pnlPrincipiante.add(btnP4);

        btnP5.addActionListener(this::btnP5ActionPerformed);
        pnlPrincipiante.add(btnP5);

        btnP6.addActionListener(this::btnP6ActionPerformed);
        pnlPrincipiante.add(btnP6);

        btnP7.addActionListener(this::btnP7ActionPerformed);
        pnlPrincipiante.add(btnP7);

        btnP8.addActionListener(this::btnP8ActionPerformed);
        pnlPrincipiante.add(btnP8);

        btnP9.addActionListener(this::btnP9ActionPerformed);
        pnlPrincipiante.add(btnP9);

        btnP10.addActionListener(this::btnP10ActionPerformed);
        pnlPrincipiante.add(btnP10);

        btnP11.addActionListener(this::btnP11ActionPerformed);
        pnlPrincipiante.add(btnP11);

        btnP12.addActionListener(this::btnP12ActionPerformed);
        pnlPrincipiante.add(btnP12);

        btnP13.addActionListener(this::btnP13ActionPerformed);
        pnlPrincipiante.add(btnP13);

        btnP14.addActionListener(this::btnP14ActionPerformed);
        pnlPrincipiante.add(btnP14);

        btnP15.addActionListener(this::btnP15ActionPerformed);
        pnlPrincipiante.add(btnP15);

        btnP16.addActionListener(this::btnP16ActionPerformed);
        pnlPrincipiante.add(btnP16);

        pnlTablero.add(pnlPrincipiante, "card2");

        pnlIntermedio.setLayout(new java.awt.GridLayout(4, 8, 2, 2));

        btnI1.addActionListener(this::btnI1ActionPerformed);
        pnlIntermedio.add(btnI1);

        btnI2.addActionListener(this::btnI2ActionPerformed);
        pnlIntermedio.add(btnI2);

        btnI3.addActionListener(this::btnI3ActionPerformed);
        pnlIntermedio.add(btnI3);

        btnI4.addActionListener(this::btnI4ActionPerformed);
        pnlIntermedio.add(btnI4);

        btnI5.addActionListener(this::btnI5ActionPerformed);
        pnlIntermedio.add(btnI5);

        btnI6.addActionListener(this::btnI6ActionPerformed);
        pnlIntermedio.add(btnI6);

        btnI7.addActionListener(this::btnI7ActionPerformed);
        pnlIntermedio.add(btnI7);

        btnI8.addActionListener(this::btnI8ActionPerformed);
        pnlIntermedio.add(btnI8);

        btnI9.addActionListener(this::btnI9ActionPerformed);
        pnlIntermedio.add(btnI9);

        btnI10.addActionListener(this::btnI10ActionPerformed);
        pnlIntermedio.add(btnI10);

        btnI11.addActionListener(this::btnI11ActionPerformed);
        pnlIntermedio.add(btnI11);

        btnI12.addActionListener(this::btnI12ActionPerformed);
        pnlIntermedio.add(btnI12);

        btnI13.addActionListener(this::btnI13ActionPerformed);
        pnlIntermedio.add(btnI13);

        btnI14.addActionListener(this::btnI14ActionPerformed);
        pnlIntermedio.add(btnI14);

        btnI15.addActionListener(this::btnI15ActionPerformed);
        pnlIntermedio.add(btnI15);

        btnI16.addActionListener(this::btnI16ActionPerformed);
        pnlIntermedio.add(btnI16);

        btnI17.addActionListener(this::btnI17ActionPerformed);
        pnlIntermedio.add(btnI17);

        btnI18.addActionListener(this::btnI18ActionPerformed);
        pnlIntermedio.add(btnI18);

        btnI19.addActionListener(this::btnI19ActionPerformed);
        pnlIntermedio.add(btnI19);

        btnI20.addActionListener(this::btnI20ActionPerformed);
        pnlIntermedio.add(btnI20);

        btnI21.addActionListener(this::btnI21ActionPerformed);
        pnlIntermedio.add(btnI21);

        btnI22.addActionListener(this::btnI22ActionPerformed);
        pnlIntermedio.add(btnI22);

        btnI23.addActionListener(this::btnI23ActionPerformed);
        pnlIntermedio.add(btnI23);

        btnI24.addActionListener(this::btnI24ActionPerformed);
        pnlIntermedio.add(btnI24);

        btnI25.addActionListener(this::btnI25ActionPerformed);
        pnlIntermedio.add(btnI25);

        btnI26.addActionListener(this::btnI26ActionPerformed);
        pnlIntermedio.add(btnI26);

        btnI27.addActionListener(this::btnI27ActionPerformed);
        pnlIntermedio.add(btnI27);

        btnI28.addActionListener(this::btnI28ActionPerformed);
        pnlIntermedio.add(btnI28);

        btnI29.addActionListener(this::btnI29ActionPerformed);
        pnlIntermedio.add(btnI29);

        btnI30.addActionListener(this::btnI30ActionPerformed);
        pnlIntermedio.add(btnI30);

        btnI31.addActionListener(this::btnI31ActionPerformed);
        pnlIntermedio.add(btnI31);

        btnI32.addActionListener(this::btnI32ActionPerformed);
        pnlIntermedio.add(btnI32);

        pnlTablero.add(pnlIntermedio, "card3");

        pnlAvanzado.setLayout(new java.awt.GridLayout(8, 8, 2, 2));

        btnA1.addActionListener(this::btnA1ActionPerformed);
        pnlAvanzado.add(btnA1);

        btnA2.addActionListener(this::btnA2ActionPerformed);
        pnlAvanzado.add(btnA2);

        btnA3.addActionListener(this::btnA3ActionPerformed);
        pnlAvanzado.add(btnA3);

        btnA4.addActionListener(this::btnA4ActionPerformed);
        pnlAvanzado.add(btnA4);

        btnA5.addActionListener(this::btnA5ActionPerformed);
        pnlAvanzado.add(btnA5);

        btnA6.addActionListener(this::btnA6ActionPerformed);
        pnlAvanzado.add(btnA6);

        btnA7.addActionListener(this::btnA7ActionPerformed);
        pnlAvanzado.add(btnA7);

        btnA8.addActionListener(this::btnA8ActionPerformed);
        pnlAvanzado.add(btnA8);

        btnA9.addActionListener(this::btnA9ActionPerformed);
        pnlAvanzado.add(btnA9);

        btnA10.addActionListener(this::btnA10ActionPerformed);
        pnlAvanzado.add(btnA10);

        btnA11.addActionListener(this::btnA11ActionPerformed);
        pnlAvanzado.add(btnA11);

        btnA12.addActionListener(this::btnA12ActionPerformed);
        pnlAvanzado.add(btnA12);

        btnA13.addActionListener(this::btnA13ActionPerformed);
        pnlAvanzado.add(btnA13);

        btnA14.addActionListener(this::btnA14ActionPerformed);
        pnlAvanzado.add(btnA14);

        btnA15.addActionListener(this::btnA15ActionPerformed);
        pnlAvanzado.add(btnA15);

        btnA16.addActionListener(this::btnA16ActionPerformed);
        pnlAvanzado.add(btnA16);

        btnA17.addActionListener(this::btnA17ActionPerformed);
        pnlAvanzado.add(btnA17);

        btnA18.addActionListener(this::btnA18ActionPerformed);
        pnlAvanzado.add(btnA18);

        btnA19.addActionListener(this::btnA19ActionPerformed);
        pnlAvanzado.add(btnA19);

        btnA20.addActionListener(this::btnA20ActionPerformed);
        pnlAvanzado.add(btnA20);

        btnA21.addActionListener(this::btnA21ActionPerformed);
        pnlAvanzado.add(btnA21);

        btnA22.addActionListener(this::btnA22ActionPerformed);
        pnlAvanzado.add(btnA22);

        btnA23.addActionListener(this::btnA23ActionPerformed);
        pnlAvanzado.add(btnA23);

        btnA24.addActionListener(this::btnA24ActionPerformed);
        pnlAvanzado.add(btnA24);

        btnA25.addActionListener(this::btnA25ActionPerformed);
        pnlAvanzado.add(btnA25);

        btnA26.addActionListener(this::btnA26ActionPerformed);
        pnlAvanzado.add(btnA26);

        btnA27.addActionListener(this::btnA27ActionPerformed);
        pnlAvanzado.add(btnA27);

        btnA28.addActionListener(this::btnA28ActionPerformed);
        pnlAvanzado.add(btnA28);

        btnA29.addActionListener(this::btnA29ActionPerformed);
        pnlAvanzado.add(btnA29);

        btnA30.addActionListener(this::btnA30ActionPerformed);
        pnlAvanzado.add(btnA30);

        btnA31.addActionListener(this::btnA31ActionPerformed);
        pnlAvanzado.add(btnA31);

        btnA32.addActionListener(this::btnA32ActionPerformed);
        pnlAvanzado.add(btnA32);

        btnA33.addActionListener(this::btnA33ActionPerformed);
        pnlAvanzado.add(btnA33);

        btnA34.addActionListener(this::btnA34ActionPerformed);
        pnlAvanzado.add(btnA34);

        btnA35.addActionListener(this::btnA35ActionPerformed);
        pnlAvanzado.add(btnA35);

        btnA36.addActionListener(this::btnA36ActionPerformed);
        pnlAvanzado.add(btnA36);

        btnA37.addActionListener(this::btnA37ActionPerformed);
        pnlAvanzado.add(btnA37);

        btnA38.addActionListener(this::btnA38ActionPerformed);
        pnlAvanzado.add(btnA38);

        btnA39.addActionListener(this::btnA39ActionPerformed);
        pnlAvanzado.add(btnA39);
        pnlAvanzado.add(btnA40);

        btnA41.addActionListener(this::btnA41ActionPerformed);
        pnlAvanzado.add(btnA41);

        btnA42.addActionListener(this::btnA42ActionPerformed);
        pnlAvanzado.add(btnA42);

        btnA43.addActionListener(this::btnA43ActionPerformed);
        pnlAvanzado.add(btnA43);

        btnA44.addActionListener(this::btnA44ActionPerformed);
        pnlAvanzado.add(btnA44);

        btnA45.addActionListener(this::btnA45ActionPerformed);
        pnlAvanzado.add(btnA45);
        pnlAvanzado.add(btnA46);
        pnlAvanzado.add(btnA47);
        pnlAvanzado.add(btnA48);

        btnA49.addActionListener(this::btnA49ActionPerformed);
        pnlAvanzado.add(btnA49);

        btnA50.addActionListener(this::btnA50ActionPerformed);
        pnlAvanzado.add(btnA50);

        btnA51.addActionListener(this::btnA51ActionPerformed);
        pnlAvanzado.add(btnA51);

        btnA52.addActionListener(this::btnA52ActionPerformed);
        pnlAvanzado.add(btnA52);

        btnA53.addActionListener(this::btnA53ActionPerformed);
        pnlAvanzado.add(btnA53);

        btnA54.addActionListener(this::btnA54ActionPerformed);
        pnlAvanzado.add(btnA54);

        btnA55.addActionListener(this::btnA55ActionPerformed);
        pnlAvanzado.add(btnA55);

        btnA56.addActionListener(this::btnA56ActionPerformed);
        pnlAvanzado.add(btnA56);

        btnA57.addActionListener(this::btnA57ActionPerformed);
        pnlAvanzado.add(btnA57);

        btnA58.addActionListener(this::btnA58ActionPerformed);
        pnlAvanzado.add(btnA58);

        btnA59.addActionListener(this::btnA59ActionPerformed);
        pnlAvanzado.add(btnA59);

        btnA60.addActionListener(this::btnA60ActionPerformed);
        pnlAvanzado.add(btnA60);

        btnA61.addActionListener(this::btnA61ActionPerformed);
        pnlAvanzado.add(btnA61);

        btnA62.addActionListener(this::btnA62ActionPerformed);
        pnlAvanzado.add(btnA62);

        btnA63.addActionListener(this::btnA63ActionPerformed);
        pnlAvanzado.add(btnA63);

        btnA64.addActionListener(this::btnA64ActionPerformed);
        pnlAvanzado.add(btnA64);

        pnlTablero.add(pnlAvanzado, "card4");

        pnlInformacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlInformacion.setMaximumSize(new java.awt.Dimension(32767, 170));
        pnlInformacion.setMinimumSize(new java.awt.Dimension(600, 170));
        pnlInformacion.setPreferredSize(new java.awt.Dimension(1000, 170));

        lblTiempo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTiempo.setText("Tiempo:");

        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRINCIPIANTE", "INTERMEDIO", "AVANZADO" }));
        cmbNivel.addActionListener(this::cmbNivelActionPerformed);

        lblPuntajeValor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPuntajeValor.setText("0");

        lblNivel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNivel.setText("Nivel:");

        lblTiempoValor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTiempoValor.setText("00:00");

        lblPuntaje.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPuntaje.setText("Puntaje:");

        lblIntentosValor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIntentosValor.setText("0");

        lblParejas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblParejas.setText("Parejas Encontradas:");

        lblParejasValor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblParejasValor.setText("0");

        lblIntentos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIntentos.setText("Intentos:");

        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(this::btnReiniciarActionPerformed);

        javax.swing.GroupLayout pnlInformacionLayout = new javax.swing.GroupLayout(pnlInformacion);
        pnlInformacion.setLayout(pnlInformacionLayout);
        pnlInformacionLayout.setHorizontalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacionLayout.createSequentialGroup()
                        .addComponent(lblNivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInformacionLayout.createSequentialGroup()
                        .addComponent(lblIntentos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIntentosValor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 569, Short.MAX_VALUE)
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacionLayout.createSequentialGroup()
                        .addComponent(lblPuntaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPuntajeValor))
                    .addGroup(pnlInformacionLayout.createSequentialGroup()
                        .addComponent(lblParejas, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblParejasValor)))
                .addGap(188, 188, 188)
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacionLayout.createSequentialGroup()
                        .addComponent(lblTiempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTiempoValor))
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );
        pnlInformacionLayout.setVerticalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacionLayout.createSequentialGroup()
                        .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbNivel)
                                .addComponent(lblNivel))
                            .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTiempoValor)
                                .addComponent(lblTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInformacionLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblIntentos)
                                    .addComponent(lblIntentosValor))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformacionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformacionLayout.createSequentialGroup()
                        .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPuntajeValor)
                            .addComponent(lblPuntaje))
                        .addGap(56, 56, 56)
                        .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblParejasValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblParejas))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTablero, javax.swing.GroupLayout.DEFAULT_SIZE, 1504, Short.MAX_VALUE)
            .addComponent(pnlInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 1504, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTablero, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        reiniciarValores();
        
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void cmbNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelActionPerformed
        mostrarTableroSegunNIvel();
    }//GEN-LAST:event_cmbNivelActionPerformed

    private void btnP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP1ActionPerformed
        seleccionarCarta(0,0);
    }//GEN-LAST:event_btnP1ActionPerformed

    private void btnP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP2ActionPerformed
        seleccionarCarta(0,1);
    }//GEN-LAST:event_btnP2ActionPerformed

    private void btnP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP3ActionPerformed
        seleccionarCarta(0,2);
    }//GEN-LAST:event_btnP3ActionPerformed

    private void btnP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP4ActionPerformed
        seleccionarCarta(0,3);
    }//GEN-LAST:event_btnP4ActionPerformed

    private void btnP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP5ActionPerformed
        seleccionarCarta(1,0);
    }//GEN-LAST:event_btnP5ActionPerformed

    private void btnP6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP6ActionPerformed
        seleccionarCarta(1,1);
    }//GEN-LAST:event_btnP6ActionPerformed

    private void btnP7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP7ActionPerformed
        seleccionarCarta(1,2);
    }//GEN-LAST:event_btnP7ActionPerformed

    private void btnP8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP8ActionPerformed
        seleccionarCarta(1,3);
    }//GEN-LAST:event_btnP8ActionPerformed

    private void btnP9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP9ActionPerformed
        seleccionarCarta(2,0);
    }//GEN-LAST:event_btnP9ActionPerformed

    private void btnP10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP10ActionPerformed
        seleccionarCarta(2,1);
    }//GEN-LAST:event_btnP10ActionPerformed

    private void btnP11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP11ActionPerformed
        seleccionarCarta(2,2);
    }//GEN-LAST:event_btnP11ActionPerformed

    private void btnP12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP12ActionPerformed
        seleccionarCarta(2,3);
    }//GEN-LAST:event_btnP12ActionPerformed

    private void btnP13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP13ActionPerformed
        seleccionarCarta(3,0);
    }//GEN-LAST:event_btnP13ActionPerformed

    private void btnP14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP14ActionPerformed
        seleccionarCarta(3,1);
    }//GEN-LAST:event_btnP14ActionPerformed

    private void btnP15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP15ActionPerformed
        seleccionarCarta(3,2);
    }//GEN-LAST:event_btnP15ActionPerformed

    private void btnP16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP16ActionPerformed
        seleccionarCarta(3,3);
    }//GEN-LAST:event_btnP16ActionPerformed

    private void btnI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI1ActionPerformed
        seleccionarCarta(0,0);                                
    }//GEN-LAST:event_btnI1ActionPerformed

    private void btnI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI2ActionPerformed
        seleccionarCarta(0,1);                                 
    }//GEN-LAST:event_btnI2ActionPerformed

    private void btnI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI3ActionPerformed
        seleccionarCarta(0,2);       }//GEN-LAST:event_btnI3ActionPerformed

    private void btnI4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI4ActionPerformed
        seleccionarCarta(0,3);   
    }//GEN-LAST:event_btnI4ActionPerformed

    private void btnI5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI5ActionPerformed
        seleccionarCarta(0,4);   
    }//GEN-LAST:event_btnI5ActionPerformed

    private void btnI6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI6ActionPerformed
        seleccionarCarta(0,5);   
    }//GEN-LAST:event_btnI6ActionPerformed

    private void btnI7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI7ActionPerformed
        seleccionarCarta(0,6);   
    }//GEN-LAST:event_btnI7ActionPerformed

    private void btnI8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI8ActionPerformed
        seleccionarCarta(0,7);   
    }//GEN-LAST:event_btnI8ActionPerformed

    private void btnI9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI9ActionPerformed
        seleccionarCarta(1,0);   
    }//GEN-LAST:event_btnI9ActionPerformed

    private void btnI10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI10ActionPerformed
        seleccionarCarta(1,1);   
    }//GEN-LAST:event_btnI10ActionPerformed

    private void btnI11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI11ActionPerformed
        seleccionarCarta(1,2);   
    }//GEN-LAST:event_btnI11ActionPerformed

    private void btnI12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI12ActionPerformed
        seleccionarCarta(1,3);   
    }//GEN-LAST:event_btnI12ActionPerformed

    private void btnI13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI13ActionPerformed
        seleccionarCarta(1,4);   
    }//GEN-LAST:event_btnI13ActionPerformed

    private void btnI14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI14ActionPerformed
        seleccionarCarta(1,5);   
    }//GEN-LAST:event_btnI14ActionPerformed

    private void btnI15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI15ActionPerformed
        seleccionarCarta(1,6);   
    }//GEN-LAST:event_btnI15ActionPerformed

    private void btnI16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI16ActionPerformed
        seleccionarCarta(1,7);   
    }//GEN-LAST:event_btnI16ActionPerformed

    private void btnI17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI17ActionPerformed
        seleccionarCarta(2,0);   
    }//GEN-LAST:event_btnI17ActionPerformed

    private void btnI18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI18ActionPerformed
        seleccionarCarta(2,1);   
    }//GEN-LAST:event_btnI18ActionPerformed

    private void btnI19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI19ActionPerformed
        seleccionarCarta(2,2);   
    }//GEN-LAST:event_btnI19ActionPerformed

    private void btnI20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI20ActionPerformed
        seleccionarCarta(2,3);   
    }//GEN-LAST:event_btnI20ActionPerformed

    private void btnI21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI21ActionPerformed
        seleccionarCarta(2,4);   
    }//GEN-LAST:event_btnI21ActionPerformed

    private void btnI22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI22ActionPerformed
        seleccionarCarta(2,5);   
    }//GEN-LAST:event_btnI22ActionPerformed

    private void btnI23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI23ActionPerformed
        seleccionarCarta(2,6);   
    }//GEN-LAST:event_btnI23ActionPerformed

    private void btnI24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI24ActionPerformed
        seleccionarCarta(2,7);   
    }//GEN-LAST:event_btnI24ActionPerformed

    private void btnI25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI25ActionPerformed
        seleccionarCarta(3,0);   
    }//GEN-LAST:event_btnI25ActionPerformed

    private void btnI26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI26ActionPerformed
        seleccionarCarta(3,1);   
    }//GEN-LAST:event_btnI26ActionPerformed

    private void btnI27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI27ActionPerformed
        seleccionarCarta(3,2);   
    }//GEN-LAST:event_btnI27ActionPerformed

    private void btnI28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI28ActionPerformed
        seleccionarCarta(3,3);   
    }//GEN-LAST:event_btnI28ActionPerformed

    private void btnI29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI29ActionPerformed
        seleccionarCarta(3,4);   
    }//GEN-LAST:event_btnI29ActionPerformed

    private void btnI30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI30ActionPerformed
        seleccionarCarta(3,5);   
    }//GEN-LAST:event_btnI30ActionPerformed

    private void btnI31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI31ActionPerformed
        seleccionarCarta(3,6);   
    }//GEN-LAST:event_btnI31ActionPerformed

    private void btnI32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI32ActionPerformed
        seleccionarCarta(3,7);   
    }//GEN-LAST:event_btnI32ActionPerformed

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed
        seleccionarCarta(0,0);   
    }//GEN-LAST:event_btnA1ActionPerformed

    private void btnA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA2ActionPerformed
        seleccionarCarta(0,1);   
    }//GEN-LAST:event_btnA2ActionPerformed

    private void btnA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA3ActionPerformed
        seleccionarCarta(0,2);   
    }//GEN-LAST:event_btnA3ActionPerformed

    private void btnA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA4ActionPerformed
        seleccionarCarta(0,3);   
    }//GEN-LAST:event_btnA4ActionPerformed

    private void btnA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA5ActionPerformed
        seleccionarCarta(0,4);   
    }//GEN-LAST:event_btnA5ActionPerformed

    private void btnA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA6ActionPerformed
        seleccionarCarta(0,5);   
    }//GEN-LAST:event_btnA6ActionPerformed

    private void btnA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA7ActionPerformed
        seleccionarCarta(0,6);   
    }//GEN-LAST:event_btnA7ActionPerformed

    private void btnA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA8ActionPerformed
        seleccionarCarta(0,7);   
    }//GEN-LAST:event_btnA8ActionPerformed

    private void btnA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA9ActionPerformed
        seleccionarCarta(1,0);   
    }//GEN-LAST:event_btnA9ActionPerformed

    private void btnA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA10ActionPerformed
        seleccionarCarta(1,1);   
    }//GEN-LAST:event_btnA10ActionPerformed

    private void btnA12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA12ActionPerformed
        seleccionarCarta(1,3);   
    }//GEN-LAST:event_btnA12ActionPerformed

    private void btnA13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA13ActionPerformed
        seleccionarCarta(1,4);   
    }//GEN-LAST:event_btnA13ActionPerformed

    private void btnA17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA17ActionPerformed
        seleccionarCarta(2,0);      
    }//GEN-LAST:event_btnA17ActionPerformed

    private void btnA18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA18ActionPerformed
        seleccionarCarta(2,1);   
    }//GEN-LAST:event_btnA18ActionPerformed

    private void btnA19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA19ActionPerformed
        seleccionarCarta(2,3);   
    }//GEN-LAST:event_btnA19ActionPerformed

    private void btnA20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA20ActionPerformed
        seleccionarCarta(2,4);   
    }//GEN-LAST:event_btnA20ActionPerformed

    private void btnA21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA21ActionPerformed
        seleccionarCarta(2,5);   
    }//GEN-LAST:event_btnA21ActionPerformed

    private void btnA25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA25ActionPerformed
        seleccionarCarta(3,1);   
    }//GEN-LAST:event_btnA25ActionPerformed

    private void btnA26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA26ActionPerformed
        seleccionarCarta(3,2);   
    }//GEN-LAST:event_btnA26ActionPerformed

    private void btnA27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA27ActionPerformed
        seleccionarCarta(3,3);   
    }//GEN-LAST:event_btnA27ActionPerformed

    private void btnA28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA28ActionPerformed
        seleccionarCarta(3,4);   
    }//GEN-LAST:event_btnA28ActionPerformed

    private void btnA29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA29ActionPerformed
        seleccionarCarta(3,5);   
    }//GEN-LAST:event_btnA29ActionPerformed

    private void btnA33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA33ActionPerformed
        seleccionarCarta(4,1);   
    }//GEN-LAST:event_btnA33ActionPerformed

    private void btnA34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA34ActionPerformed
        seleccionarCarta(4,2);   
    }//GEN-LAST:event_btnA34ActionPerformed

    private void btnA35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA35ActionPerformed
        seleccionarCarta(4,3);   
    }//GEN-LAST:event_btnA35ActionPerformed

    private void btnA36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA36ActionPerformed
        seleccionarCarta(4,4);   
    }//GEN-LAST:event_btnA36ActionPerformed

    private void btnA37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA37ActionPerformed
        seleccionarCarta(4,5);   
    }//GEN-LAST:event_btnA37ActionPerformed

    private void btnA41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA41ActionPerformed

    private void btnA42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA42ActionPerformed

    private void btnA43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA43ActionPerformed

    private void btnA44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA44ActionPerformed

    private void btnA45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA45ActionPerformed

    private void btnA49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA49ActionPerformed

    private void btnA50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA50ActionPerformed

    private void btnA51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA51ActionPerformed

    private void btnA52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA52ActionPerformed

    private void btnA53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA53ActionPerformed

    private void btnA57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA57ActionPerformed

    private void btnA58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA58ActionPerformed

    private void btnA59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA59ActionPerformed

    private void btnA60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA60ActionPerformed

    private void btnA61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA61ActionPerformed

    private void btnA62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA62ActionPerformed

    private void btnA63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA63ActionPerformed

    private void btnA64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA64ActionPerformed

    private void btnA54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA54ActionPerformed

    private void btnA55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA55ActionPerformed

    private void btnA56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA56ActionPerformed

    private void btnA14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA14ActionPerformed
        seleccionarCarta(1,5);   
    }//GEN-LAST:event_btnA14ActionPerformed

    private void btnA15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA15ActionPerformed
        seleccionarCarta(1,6);   
    }//GEN-LAST:event_btnA15ActionPerformed

    private void btnA16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA16ActionPerformed
        seleccionarCarta(1,7);   
    }//GEN-LAST:event_btnA16ActionPerformed

    private void btnA11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA11ActionPerformed
        seleccionarCarta(1,2);   
    }//GEN-LAST:event_btnA11ActionPerformed

    private void btnA22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA22ActionPerformed
        seleccionarCarta(2,6);   
    }//GEN-LAST:event_btnA22ActionPerformed

    private void btnA23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA23ActionPerformed
        seleccionarCarta(2,7);   
    }//GEN-LAST:event_btnA23ActionPerformed

    private void btnA24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA24ActionPerformed
        seleccionarCarta(3,0);   
    }//GEN-LAST:event_btnA24ActionPerformed

    private void btnA30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA30ActionPerformed
        seleccionarCarta(3,6);   
    }//GEN-LAST:event_btnA30ActionPerformed

    private void btnA31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA31ActionPerformed
        seleccionarCarta(3,7);   
    }//GEN-LAST:event_btnA31ActionPerformed

    private void btnA32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA32ActionPerformed
        seleccionarCarta(4,0);   
    }//GEN-LAST:event_btnA32ActionPerformed

    private void btnA38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA38ActionPerformed
        seleccionarCarta(4,6);   
    }//GEN-LAST:event_btnA38ActionPerformed

    private void btnA39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA39ActionPerformed
        seleccionarCarta(4,7);   
    }//GEN-LAST:event_btnA39ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmJuego().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnA10;
    private javax.swing.JButton btnA11;
    private javax.swing.JButton btnA12;
    private javax.swing.JButton btnA13;
    private javax.swing.JButton btnA14;
    private javax.swing.JButton btnA15;
    private javax.swing.JButton btnA16;
    private javax.swing.JButton btnA17;
    private javax.swing.JButton btnA18;
    private javax.swing.JButton btnA19;
    private javax.swing.JButton btnA2;
    private javax.swing.JButton btnA20;
    private javax.swing.JButton btnA21;
    private javax.swing.JButton btnA22;
    private javax.swing.JButton btnA23;
    private javax.swing.JButton btnA24;
    private javax.swing.JButton btnA25;
    private javax.swing.JButton btnA26;
    private javax.swing.JButton btnA27;
    private javax.swing.JButton btnA28;
    private javax.swing.JButton btnA29;
    private javax.swing.JButton btnA3;
    private javax.swing.JButton btnA30;
    private javax.swing.JButton btnA31;
    private javax.swing.JButton btnA32;
    private javax.swing.JButton btnA33;
    private javax.swing.JButton btnA34;
    private javax.swing.JButton btnA35;
    private javax.swing.JButton btnA36;
    private javax.swing.JButton btnA37;
    private javax.swing.JButton btnA38;
    private javax.swing.JButton btnA39;
    private javax.swing.JButton btnA4;
    private javax.swing.JButton btnA40;
    private javax.swing.JButton btnA41;
    private javax.swing.JButton btnA42;
    private javax.swing.JButton btnA43;
    private javax.swing.JButton btnA44;
    private javax.swing.JButton btnA45;
    private javax.swing.JButton btnA46;
    private javax.swing.JButton btnA47;
    private javax.swing.JButton btnA48;
    private javax.swing.JButton btnA49;
    private javax.swing.JButton btnA5;
    private javax.swing.JButton btnA50;
    private javax.swing.JButton btnA51;
    private javax.swing.JButton btnA52;
    private javax.swing.JButton btnA53;
    private javax.swing.JButton btnA54;
    private javax.swing.JButton btnA55;
    private javax.swing.JButton btnA56;
    private javax.swing.JButton btnA57;
    private javax.swing.JButton btnA58;
    private javax.swing.JButton btnA59;
    private javax.swing.JButton btnA6;
    private javax.swing.JButton btnA60;
    private javax.swing.JButton btnA61;
    private javax.swing.JButton btnA62;
    private javax.swing.JButton btnA63;
    private javax.swing.JButton btnA64;
    private javax.swing.JButton btnA7;
    private javax.swing.JButton btnA8;
    private javax.swing.JButton btnA9;
    private javax.swing.JButton btnI1;
    private javax.swing.JButton btnI10;
    private javax.swing.JButton btnI11;
    private javax.swing.JButton btnI12;
    private javax.swing.JButton btnI13;
    private javax.swing.JButton btnI14;
    private javax.swing.JButton btnI15;
    private javax.swing.JButton btnI16;
    private javax.swing.JButton btnI17;
    private javax.swing.JButton btnI18;
    private javax.swing.JButton btnI19;
    private javax.swing.JButton btnI2;
    private javax.swing.JButton btnI20;
    private javax.swing.JButton btnI21;
    private javax.swing.JButton btnI22;
    private javax.swing.JButton btnI23;
    private javax.swing.JButton btnI24;
    private javax.swing.JButton btnI25;
    private javax.swing.JButton btnI26;
    private javax.swing.JButton btnI27;
    private javax.swing.JButton btnI28;
    private javax.swing.JButton btnI29;
    private javax.swing.JButton btnI3;
    private javax.swing.JButton btnI30;
    private javax.swing.JButton btnI31;
    private javax.swing.JButton btnI32;
    private javax.swing.JButton btnI4;
    private javax.swing.JButton btnI5;
    private javax.swing.JButton btnI6;
    private javax.swing.JButton btnI7;
    private javax.swing.JButton btnI8;
    private javax.swing.JButton btnI9;
    private javax.swing.JButton btnP1;
    private javax.swing.JButton btnP10;
    private javax.swing.JButton btnP11;
    private javax.swing.JButton btnP12;
    private javax.swing.JButton btnP13;
    private javax.swing.JButton btnP14;
    private javax.swing.JButton btnP15;
    private javax.swing.JButton btnP16;
    private javax.swing.JButton btnP2;
    private javax.swing.JButton btnP3;
    private javax.swing.JButton btnP4;
    private javax.swing.JButton btnP5;
    private javax.swing.JButton btnP6;
    private javax.swing.JButton btnP7;
    private javax.swing.JButton btnP8;
    private javax.swing.JButton btnP9;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JComboBox<String> cmbNivel;
    private javax.swing.JLabel lblIntentos;
    private javax.swing.JLabel lblIntentosValor;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblParejas;
    private javax.swing.JLabel lblParejasValor;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblPuntajeValor;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTiempoValor;
    private javax.swing.JPanel pnlAvanzado;
    private javax.swing.JPanel pnlInformacion;
    private javax.swing.JPanel pnlIntermedio;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlPrincipiante;
    private javax.swing.JPanel pnlTablero;
    // End of variables declaration//GEN-END:variables
}
