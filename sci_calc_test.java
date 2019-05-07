import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class test extends JFrame {

    static JFrame f;
    static JTextField t;

    public static void main(String[] args) {

      f = new JFrame("Calculator");
      try {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
      }
      catch (Exception e) {
          System.out.println("Look and Feel Not Set!");
      }

      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setResizable(false);

      t = new JTextField(16);
      t.setBackground(new Color(214, 217, 223));

      t.setEditable(false);

      JButton bShift, bAlpha, bla, bra, bMode, bsnd, bcalc, bint, bup, bdwn, binv, bloga, bfrac, broot, bsqr, bpwr, blog, bln, bneg, bapos, bhyp, bsin, bcos, btan, brcl, beng, blpara, brpara, bsd, bmpls;
      JButton b7, b8, b9, bdel, bac, b4, b5, b6, bmul, bdiv, b1, b2, b3, bpls, bmin, b0, bdot, bexp, bans, beq;

      bShift = new JButton("SHIFT");
      bAlpha = new JButton("ALPHA");
      bla = new JButton("<-");
      bra = new JButton("->");
      bMode = new JButton("MODE");
      bsnd = new JButton("2nd");
      bcalc = new JButton("CALC");
      bint = new JButton("sdx");
      bup = new JButton("^");
      bdwn = new JButton("v");
      binv = new JButton("x -1");
      bloga = new JButton("Loga");
      bfrac = new JButton("0/0");
      broot = new JButton("v-");
      bsqr = new JButton("x2");
      bpwr = new JButton("x^");
      blog = new JButton("Log");
      bln = new JButton("Ln");
      bneg = new JButton("(-)");
      bapos = new JButton(" \' \"");
      bhyp = new JButton("hyp");
      bsin  = new JButton("Sin");
      bcos = new JButton("Cos");
      btan = new JButton("Tan");
      brcl = new JButton("RCL");
      beng = new JButton("ENG");
      blpara = new JButton("(");
      brpara = new JButton(")");
      bsd = new JButton("SD");
      bmpls = new JButton("M+");

      b7 = new JButton("7");
      b8 = new JButton("8");
      b9 = new JButton("9");
      bdel = new JButton("DEL");
      bac = new JButton("AC");
      b4 = new JButton("4");
      b5 = new JButton("5");
      b6 = new JButton("6");
      bmul = new JButton("x");
      bdiv = new JButton("/");
      b1 = new JButton("1");
      b2 = new JButton("2");
      b3 = new JButton("3");
      bpls = new JButton("+");
      bmin = new JButton("-");
      b0 = new JButton("0");
      bdot = new JButton(".");
      bexp = new JButton("Exp");
      bans = new JButton("Ans");
      beq = new JButton("=");

      JButton bsolve, bddx, bhex, bclr, bxfact, bdec, bx10, beX, bA, bB, bC, bD, bE, bF, bfst, bMat, bCmplx, bnPr, bnCr, bPi, beval, bCot, bCoti, bBin, bOct, bHis, bMod, bBaseN, bBC, bDM;
      JButton bSci;

      bsolve = new JButton("SOLVE");
      bddx = new JButton("d/dx");
      bhex = new JButton("hex");
      bclr = new JButton("clr");
      bxfact = new JButton("x!");
      bdec = new JButton("DEC");
      bx10 = new JButton("10^x");
      beX = new JButton("e^x");
      bA = new JButton("A");
      bB = new JButton("B");
      bC = new JButton("C");
      bD = new JButton("D");
      bE = new JButton("E");
      bF = new JButton("F");
      bfst = new JButton("1st");
      bMat = new JButton("MATRIX");
      bCmplx = new JButton("COMPLEX");
      bnPr = new JButton("nPr");
      bnCr = new JButton("nCr");
      bPi = new JButton("PI");
      beval = new JButton("e");
      bCot = new JButton("Cot");
      bCoti = new JButton("Cot -1");
      bBin = new JButton("BIN");
      bOct = new JButton("OCT");
      bHis = new JButton("HISTORY");
      bMod = new JButton("MOD");
      bBaseN = new JButton("BaseN");
      bBC = new JButton("BC");
      bDM = new JButton("<html>DARK /<br>LIGHT</html>");
      bSci = new JButton("USE SCIENTIFIC");


      JPanel p0 = new JPanel();
      p0.setLayout(new GridLayout(3, 1));

      JPanel p1 = new JPanel();
      p1.setLayout(new GridLayout(5, 6));

      // JPanel p3 = new JPanel();
      // p3.setLayout(new GridLayout(5, 6));

      JPanel p2 = new JPanel();
      p2.setLayout(new GridLayout(4, 5));

      p1.add(bShift);
      p1.add(bAlpha);
      p1.add(bla);
      p1.add(bra);
      p1.add(bMode);
      p1.add(bsnd);

      p1.add(bcalc);
      p1.add(bint);
      p1.add(bup);
      p1.add(bdwn);
      p1.add(binv);
      p1.add(bloga);

      p1.add(bfrac);
      p1.add(broot);
      p1.add(bsqr);
      p1.add(bpwr);
      p1.add(blog);
      p1.add(bln);

      p1.add(bneg);
      p1.add(bapos);
      p1.add(bhyp);
      p1.add(bsin);
      p1.add(bcos);
      p1.add(btan);

      p1.add(brcl);
      p1.add(beng);
      p1.add(blpara);
      p1.add(brpara);
      p1.add(bsd);
      p1.add(bmpls);

      p2.add(b7);
      p2.add(b8);
      p2.add(b9);
      p2.add(bdel);
      p2.add(bac);

      p2.add(b4);
      p2.add(b5);
      p2.add(b6);
      p2.add(bmul);
      p2.add(bdiv);

      p2.add(b1);
      p2.add(b2);
      p2.add(b3);
      p2.add(bpls);
      p2.add(bmin);

      p2.add(b0);
      p2.add(bdot);
      p2.add(bexp);
      p2.add(bans);
      p2.add(beq);

      p0.add(t);
      p0.add(p1);
      p0.add(p2);

      f.add(p0);
      f.setSize(500, 700);
      f.show();

      bsnd.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                p1.removeAll();

                p1.add(bdec);
                p1.add(bddx);
                p1.add(bhex);
                p1.add(bclr);
                p1.add(bxfact);
                p1.add(bfst);

                p1.add(bx10);
                p1.add(beX);
                p1.add(bA);
                p1.add(bB);
                p1.add(bC);
                p1.add(bD);

                p1.add(bE);
                p1.add(bF);
                p1.add(bsolve);
                p1.add(bMat);
                p1.add(bCmplx);
                p1.add(bnCr);

                p1.add(bnPr);
                p1.add(bPi);
                p1.add(beval);
                p1.add(bCot);
                p1.add(bCoti);
                p1.add(bBin);

                p1.add(bOct);
                p1.add(bHis);
                p1.add(bMod);
                p1.add(bBaseN);
                p1.add(bBC);
                p1.add(bDM);

                p1.revalidate();

                p0.add(t);
                p0.add(p1);
                p0.add(p2);

                f.add(p0);
                f.setSize(499, 699);
                f.show();

            }
        });

      bfst.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){

                p1.removeAll();

                p1.add(bShift);
                p1.add(bAlpha);
                p1.add(bla);
                p1.add(bra);
                p1.add(bMode);
                p1.add(bsnd);

                p1.add(bcalc);
                p1.add(bint);
                p1.add(bup);
                p1.add(bdwn);
                p1.add(binv);
                p1.add(bloga);

                p1.add(bfrac);
                p1.add(broot);
                p1.add(bsqr);
                p1.add(bpwr);
                p1.add(blog);
                p1.add(bln);

                p1.add(bneg);
                p1.add(bapos);
                p1.add(bhyp);
                p1.add(bsin);
                p1.add(bcos);
                p1.add(btan);

                p1.add(brcl);
                p1.add(beng);
                p1.add(blpara);
                p1.add(brpara);
                p1.add(bsd);
                p1.add(bmpls);

                p1.revalidate();

                p0.add(t);
                p0.add(p1);
                p0.add(p2);

                f.add(p0);
                f.setSize(500, 700);
                f.show();

            }
        });

        bBC.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                p0.removeAll();

                p0.setLayout(new GridLayout(2, 1));

                p0.add(t);

                bdel.setText("<html>DEL  /<br>SCI_CALC</html>");
                // p0.add(bSci);
                p0.add(p2);

                p0.revalidate();

                f.add(p0);
                f.setSize(501, 700);
                f.show();

            }
        });

        bdel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Rectangle r = f.getBounds();

                if(e.getClickCount() == 2 && r.width == 501) {

                    p0.removeAll();
                    p0.setLayout(new GridLayout(3, 1));

                    p0.add(t);
                    p0.add(p1);
                    p0.add(p2);

                    p0.revalidate();

                    f.add(p0);
                    f.setSize(499, 699);
                    f.show();

                    bdel.setText("DEL");
                }
            }
        });

        bDM.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 1) {

                    t.setBackground(Color.GRAY);
                    p1.setBackground(Color.GRAY);
                    p2.setBackground(Color.GRAY);
                    p0.setBackground(Color.GRAY);
                    // try {
                    //     UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    // }
                    // catch(Exception x) {
                    //     System.out.println("Look and feel Not set!");
                    // }
                }
                else if(e.getClickCount() == 2) {

                    t.setBackground(new Color(214, 217, 223));
                    p1.setBackground(new Color(214, 217, 223));
                    p2.setBackground(new Color(214, 217, 223));
                    p0.setBackground(new Color(214, 217, 223));
                    // try {
                    //     UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                    // }
                    // catch(Exception x) {
                    //     System.out.println("Look and feel Not Set!");
                    // }
                }
            }
        });



    }

}
