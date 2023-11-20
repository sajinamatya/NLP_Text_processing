/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package week4;

import java.util.Arrays;

/**
 *
 * @author prithivi
 */
public class SortingPractice extends javax.swing.JFrame {

    /**
     * Creates new form SortingPractice
     */
    public SortingPractice() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sortTable = new javax.swing.JTable();
        sortBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sortTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(0), "a"},
                { new Integer(3), "c"},
                { new Integer(4), "d"},
                { new Integer(2), "b"}
            },
            new String [] {
                "numbers", "alphabets"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        sortTable.setGridColor(new java.awt.Color(153, 255, 153));
        sortTable.setSelectionBackground(new java.awt.Color(255, 255, 0));
        sortTable.setShowGrid(true);
        sortTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(sortTable);

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

    public void selectionSort(int[] nums,String[] str){
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
            
            //word swap
            
            String temp1 = str[step];
            str[step] = str[minIndex];
            str[minIndex] = temp1;
                    }
    }
    
    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBtnActionPerformed
        int tableSize = sortTable.getRowCount();
        int[] nums = new int[tableSize];
        String[] str = new String[tableSize];
        for(int i = 0; i<tableSize; i++){
            nums[i] = (int)sortTable.getValueAt(i, 0);
            str[i] = (String)sortTable.getValueAt(i, 1);
        }
        
        System.out.println(Arrays.toString(nums));
        selectionSort(nums,str);
        System.out.println(Arrays.toString(str));
        
        for(int i = 0; i<tableSize; i++){
            sortTable.setValueAt(nums[i], i, 0);
            sortTable.setValueAt(str[i], i,1 );
        }
    }//GEN-LAST:event_sortBtnActionPerformed

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
