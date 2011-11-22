/*
 *  Copyright (c) 2011, StripBandunk and/or its affiliates. All rights reserved.
 * 
 *       http://stripbandunk.com/
 * 
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/*
 * Form.java
 *
 * Created on Nov 21, 2011, 10:52:35 PM
 */
package com.stripbandunk.alexvariasi.view;

import com.stripbandunk.alexvariasi.view.impl.BerandaView;
import com.stripbandunk.alexvariasi.view.impl.DaftarKategoriView;
import com.stripbandunk.jglasspane.JGlassPane;
import com.stripbandunk.jglasspane.component.ImageTransitionComponent;
import com.stripbandunk.jglasspane.component.MessageComponent;
import com.stripbandunk.jglasspane.helper.GraphicHelper;
import com.stripbandunk.jglasspane.transition.image.FadeImageTransition;
import com.stripbandunk.jglasspane.transition.image.creator.ComponentImageCreator;
import java.awt.CardLayout;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComponent;

/**
 *
 * @author Eko Kurniawan Khannedy
 */
public class FormApp extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private JGlassPane jGlassPane;

    private ImageTransitionComponent imageTransitionComponent;

    private MessageComponent messageComponent;

    private FadeImageTransition fadeImageTransition;

    private ComponentImageCreator componentImageCreator;

    private Map<String, View> map;

    /** Creates new form Form */
    public FormApp() {
        initComponents();
        initGlassPanes();
        initViews();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBarApp = new javax.swing.JMenuBar();
        jMenuAplikasi = new javax.swing.JMenu();
        jMenuItemKeluarAplikasi = new javax.swing.JMenuItem();
        jMenuItemTutupAplikasi = new javax.swing.JMenuItem();
        jMenuDataMaster = new javax.swing.JMenu();
        jMenuItemKategori = new javax.swing.JMenuItem();
        jMenuItemSatuan = new javax.swing.JMenuItem();
        jMenuItemBarang = new javax.swing.JMenuItem();
        jMenuItemPemasok = new javax.swing.JMenuItem();
        jMenuItemPelanggan = new javax.swing.JMenuItem();
        jMenuItemPenjual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alex-Variasi");
        getContentPane().setLayout(new java.awt.CardLayout());

        jMenuBarApp.setName("jMenuBarApp"); // NOI18N

        jMenuAplikasi.setText("Aplikasi");
        jMenuAplikasi.setName("jMenuAplikasi"); // NOI18N

        jMenuItemKeluarAplikasi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemKeluarAplikasi.setText("Keluar Aplikasi");
        jMenuItemKeluarAplikasi.setName("jMenuItemKeluarAplikasi"); // NOI18N
        jMenuAplikasi.add(jMenuItemKeluarAplikasi);

        jMenuItemTutupAplikasi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemTutupAplikasi.setText("Tutup Aplikasi");
        jMenuItemTutupAplikasi.setName("jMenuItemTutupAplikasi"); // NOI18N
        jMenuAplikasi.add(jMenuItemTutupAplikasi);

        jMenuBarApp.add(jMenuAplikasi);

        jMenuDataMaster.setText("Data Master");
        jMenuDataMaster.setName("jMenuDataMaster"); // NOI18N

        jMenuItemKategori.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemKategori.setText("Kategori");
        jMenuItemKategori.setName("jMenuItemKategori"); // NOI18N
        jMenuItemKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKategoriActionPerformed(evt);
            }
        });
        jMenuDataMaster.add(jMenuItemKategori);

        jMenuItemSatuan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSatuan.setText("Satuan");
        jMenuItemSatuan.setName("jMenuItemSatuan"); // NOI18N
        jMenuDataMaster.add(jMenuItemSatuan);

        jMenuItemBarang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemBarang.setText("Barang");
        jMenuItemBarang.setName("jMenuItemBarang"); // NOI18N
        jMenuDataMaster.add(jMenuItemBarang);

        jMenuItemPemasok.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPemasok.setText("Pemasok");
        jMenuItemPemasok.setName("jMenuItemPemasok"); // NOI18N
        jMenuDataMaster.add(jMenuItemPemasok);

        jMenuItemPelanggan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPelanggan.setText("Pelanggan");
        jMenuItemPelanggan.setName("jMenuItemPelanggan"); // NOI18N
        jMenuDataMaster.add(jMenuItemPelanggan);

        jMenuItemPenjual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPenjual.setText("Penjual");
        jMenuItemPenjual.setName("jMenuItemPenjual"); // NOI18N
        jMenuDataMaster.add(jMenuItemPenjual);

        jMenuBarApp.add(jMenuDataMaster);

        setJMenuBar(jMenuBarApp);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-810)/2, (screenSize.height-630)/2, 810, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKategoriActionPerformed
        // TODO add your handling code here:
        showComponent("daftar-kategori");
    }//GEN-LAST:event_jMenuItemKategoriActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAplikasi;
    private javax.swing.JMenuBar jMenuBarApp;
    private javax.swing.JMenu jMenuDataMaster;
    private javax.swing.JMenuItem jMenuItemBarang;
    private javax.swing.JMenuItem jMenuItemKategori;
    private javax.swing.JMenuItem jMenuItemKeluarAplikasi;
    private javax.swing.JMenuItem jMenuItemPelanggan;
    private javax.swing.JMenuItem jMenuItemPemasok;
    private javax.swing.JMenuItem jMenuItemPenjual;
    private javax.swing.JMenuItem jMenuItemSatuan;
    private javax.swing.JMenuItem jMenuItemTutupAplikasi;
    // End of variables declaration//GEN-END:variables

    private void initGlassPanes() {
        jGlassPane = new JGlassPane();

        imageTransitionComponent = new ImageTransitionComponent();
        messageComponent = new MessageComponent();

        fadeImageTransition = new FadeImageTransition();
        imageTransitionComponent.setTransition(fadeImageTransition);

        componentImageCreator = new ComponentImageCreator(getContentPane());
        imageTransitionComponent.setImageCreator(componentImageCreator);

        jGlassPane.addGlassPaneComponent(imageTransitionComponent);
        jGlassPane.addGlassPaneComponent(messageComponent);

        setGlassPane(jGlassPane);
        getGlassPane().setVisible(true);
    }

    public void showComponent(String componentId) {
        Point point = GraphicHelper.getLocation(getContentPane(), imageTransitionComponent);
        fadeImageTransition.setCoordinate(point);
        imageTransitionComponent.start();

        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), componentId);

        View view = map.get(componentId);
        if (view != null) {
            view.view(this);
        }
    }

    private void initViews() {
        map = new HashMap<>(10);

        addView("beranda", new BerandaView());
        addView("daftar-kategori", new DaftarKategoriView());
    }

    private void addView(String componentId, JComponent component) {
        if (component instanceof View) {
            View view = (View) component;
            map.put(componentId, view);
            getContentPane().add(componentId, component);
        }
    }
}
