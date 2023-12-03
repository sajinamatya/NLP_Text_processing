/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.datastructure2023.week5;

import java.util.Arrays;

/**
 *
 * @author sajin 
 * 
 */
public class SortingPractice extends javax.swing.JFrame {

    /**
     * Creates new form SortingPractice
     */
    public SortingPractice() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sortTable = new javax.swing.JTable();
        sortBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sortTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(4), "Hello"},
                { new Integer(7), "Paint"},
                { new Integer(2), "Gun"},
                { new Integer(0), "Plane"},
                { new Integer(5), "Laptop"}
            },
            new String [] {
                "Numbers", "Words"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sortTable.setGridColor(new java.awt.Color(153, 255, 153));
        sortTable.setSelectionBackground(new java.awt.Color(255, 255, 0));
        sortTable.setShowGrid(true);
        sortTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(sortTable);
        if (sortTable.getColumnModel().getColumnCount() > 0) {
            sortTable.getColumnModel().getColumn(0).setResizable(false);
            sortTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            sortTable.getColumnModel().getColumn(1).setResizable(false);
        }

        sortBtn.setText("Sort");
        sortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(sortBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void selectionSortWithWords(int[] nums, String[] words){
        int size = nums.length;
        
        for(int step=0; step<size-1; step++){
            int minIndex = step;
            
            for(int next=step+1; next<size; next++){
                if(nums[next]<nums[minIndex]){
                    minIndex = next;
                }
            }
            //number swap
            int temp = nums[step];
            nums[step] = nums[minIndex];
            nums[minIndex] = temp;
            
            String tempWord = words[step];
            words[step] = words[minIndex];
            words[minIndex] = tempWord;
            
            //word swap
            
        }
    }
    
    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBtnActionPerformed
        int tableSize = sortTable.getRowCount();
        int[] nums = new int[tableSize];
//        String[] words = new String[tableSize];
        
        MergeSortAlgorithm mergeAlgorithm = new MergeSortAlgorithm();
        
        for(int i = 0; i<tableSize; i++){
            nums[i] = (int) sortTable.getValueAt(i, 0);
//            words[i] = (String) sortTable.getValueAt(i, 1);
        }
        
        System.out.println(Arrays.toString(nums));
        mergeAlgorithm.sort(nums);
//        selectionSortWithWords(nums, words);
        System.out.println(Arrays.toString(nums));
        
        for(int i = 0; i<tableSize; i++){
            sortTable.setValueAt(nums[i], i, 0);
//            sortTable.setValueAt(words[i],i,1);
        }
    }//GEN-LAST:event_sortBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SortingPractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingPractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingPractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingPractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SortingPractice().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sortBtn;
    private javax.swing.JTable sortTable;
    // End of variables declaration//GEN-END:variables
}
