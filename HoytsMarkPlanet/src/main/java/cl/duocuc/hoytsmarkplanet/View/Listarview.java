/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cl.duocuc.hoytsmarkplanet.View;

import cl.duocuc.hoytsmarkplanet.DAO.database;
import cl.duocuc.hoytsmarkplanet.DTO.peliculasDTO;
import cl.duocuc.hoytsmarkplanet.Services.Ipeliculas;
import cl.duocuc.hoytsmarkplanet.Services.PeliculaService;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Listarview extends javax.swing.JInternalFrame {

    private static Ipeliculas omega;
    public Listarview() {
        
        initComponents();
        if (omega==null){
            omega=new PeliculaService();
        }
        ctabla(this.omega.Listar());
        

    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enunciado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        enunciado1 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        alfa = new javax.swing.JTextField();
        beta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        enunciado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        enunciado.setText("Listado de peliculas disponibles");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TITULO", "DIRECTOR", "AÑO", "DURACIÓN", "GÉNERO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        enunciado1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        enunciado1.setText("Filtrar por género :");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ACCION", "ANIMACION", "CRIMEN", "CIENCIA FICCION", "COMEDIA", "DRAMA", "TERROR" }));
        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
            }
        });
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        jButton1.setText("Filtrar por Año");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Desde :");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Hasta :");

        jButton2.setText("ACTUALIZAR");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enunciado1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alfa, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(beta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(enunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enunciado1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(alfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(beta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();   
        String query=combo.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> t=new TableRowSorter<DefaultTableModel>(modelo);
        tabla.setRowSorter(t);
        if (query !=""){
            t.setRowFilter(RowFilter.regexFilter(query));
        }else{
            tabla.setRowSorter(t);
        }
    }//GEN-LAST:event_comboActionPerformed
    
    
    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
        
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();   
        String query=combo.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> t=new TableRowSorter<DefaultTableModel>(modelo);
        tabla.setRowSorter(t);
        if (query !=""){
            t.setRowFilter(RowFilter.regexFilter(query));
        }else{
            tabla.setRowSorter(t);
        }
        
        
    }//GEN-LAST:event_comboItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<peliculasDTO> lista = new ArrayList<>();
        int a;
        int b;
        a=Integer.parseInt(alfa.getText());
        b=Integer.parseInt(beta.getText());
        lista=omega.filtroAnio(a, b);
        
        if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes llenar ambos campos"); 
        }else{
            
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            TableRowSorter<DefaultTableModel> t=new TableRowSorter<DefaultTableModel>(modelo);
            modelo.setRowCount(0);
            tabla.setRowSorter(t);
            ctabla(omega.filtroAnio(a, b));
            alfa.setText("");
            beta.setText("");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            TableRowSorter<DefaultTableModel> t=new TableRowSorter<DefaultTableModel>(modelo);
            modelo.setRowCount(0);
            tabla.setRowSorter(t);
            ctabla(omega.Listar());
    }//GEN-LAST:event_jButton2ActionPerformed
           private void ctabla(List<peliculasDTO> lista){
            JTable t=tabla;
            t.selectAll();
            t.clearSelection();
            DefaultTableModel model=(DefaultTableModel)t.getModel();
            for (peliculasDTO p:lista){
                model.addRow(new Object[]{
                    p.getId(),
                    p.getTitulo(),
                    p.getDirector(),
                    p.getAno(),
                    p.getDuracion(),
                    p.getGenero()
                    }); }
            }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alfa;
    private javax.swing.JTextField beta;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel enunciado;
    private javax.swing.JLabel enunciado1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
