/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menusearch.ui;
import menusearch.logic.MenuSearcher;
import menusearch.db.SearchParameters;
import menusearch.json.JSONProcessor;
import menusearch.logic.RecipeSearch;

/**
 *
 * @author lyu080
 */
public class MenuSearchJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form MenuSearchJFrame1
     */
    
    public MenuSearchJFrame1() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IngreField = new javax.swing.JTextField();
        AllerField = new javax.swing.JTextField();
        DietField = new javax.swing.JTextField();
        CuiField = new javax.swing.JTextField();
        CourField = new javax.swing.JTextField();
        HoliField = new javax.swing.JTextField();
        NutriField = new javax.swing.JTextField();
        FlavField = new javax.swing.JTextField();
        ClearButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ExIngre = new javax.swing.JTextField();
        ExCui = new javax.swing.JTextField();
        ExCour = new javax.swing.JTextField();
        ExHoli = new javax.swing.JTextField();
        RecipeBox = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PhraseField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Menu Search", jPanel1);

        jLabel1.setText("Ingredient(s):");

        jLabel2.setText("Allergies:");

        jLabel3.setText("Diet:");

        jLabel4.setText("Cuisines:");

        jLabel5.setText("Courses:");

        jLabel6.setText("Holidays:");

        jLabel7.setText("Nutrition:");

        jLabel8.setText("Flavor:");

        IngreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreFieldActionPerformed(evt);
            }
        });

        CuiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuiFieldActionPerformed(evt);
            }
        });

        CourField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourFieldActionPerformed(evt);
            }
        });

        HoliField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoliFieldActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Exclude Ingredients:");

        jLabel10.setText("Exclude Cuisine:");

        jLabel11.setText("Exclude Courses:");

        jLabel12.setText("Exclude Holidays:");

        ExIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExIngreActionPerformed(evt);
            }
        });

        ExCour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExCourActionPerformed(evt);
            }
        });

        RecipeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecipeBoxActionPerformed(evt);
            }
        });

        jLabel13.setText("Phrase:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NutriField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PhraseField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FlavField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HoliField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CourField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CuiField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IngreField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(AllerField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DietField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel11)))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ExCui)
                                            .addComponent(ExCour)
                                            .addComponent(ExHoli, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                        .addComponent(ExIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RecipeBox, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(RecipeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(PhraseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IngreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(ExIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AllerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DietField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CuiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(ExCui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CourField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(ExCour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HoliField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(ExHoli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(NutriField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(FlavField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearButton)
                    .addComponent(SearchButton)
                    .addComponent(ExitButton))
                .addGap(72, 72, 72))
        );

        jTabbedPane1.addTab("Recipe Search", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreFieldActionPerformed
        
    }//GEN-LAST:event_IngreFieldActionPerformed

    private void CuiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuiFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuiFieldActionPerformed

    private void CourFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourFieldActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ExIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExIngreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExIngreActionPerformed

    private void ExCourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExCourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExCourActionPerformed

    private void RecipeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecipeBoxActionPerformed

    }//GEN-LAST:event_RecipeBoxActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
     RecipeSearch re = new RecipeSearch();

     String phrase, ingredient, allergy, diet, cuisine, course, holiday, nutrition, flavor, exIngredient, exCuisine, exCourse, exHoliday;
         phrase = PhraseField.getText();
         ingredient = IngreField.getText();
         allergy = AllerField.getText();
         diet = DietField.getText();
         cuisine = CuiField.getText();
         course = CourField.getText();
         holiday = HoliField.getText();
         nutrition = NutriField.getText();
         flavor = FlavField.getText();
         exIngredient = ExIngre.getText();
         exCuisine = ExCui.getText();
         exCourse = ExCour.getText();
         exHoliday = ExHoli.getText();
     //code that calls search method in recipe summary class.
         
re.search(phrase, ingredient, exIngredient, allergy, diet, cuisine, exCuisine, course, exCourse, holiday, exHoliday, nutrition, WIDTH, WIDTH, flavor, WIDTH);
 
//RecipeBox.add(this, re.search(phrase, ingredient, exIngredient, allergy, diet, cuisine, exCuisine, course, exCourse, holiday, exHoliday, nutrition, WIDTH, WIDTH, flavor, WIDTH));
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        PhraseField.setText("");
        IngreField.setText("");
        AllerField.setText("");
        DietField.setText("");
        CuiField.setText("");
        CourField.setText("");
        HoliField.setText("");
        NutriField.setText("");
        FlavField.setText("");
        ExIngre.setText("");
        ExCui.setText("");
        ExCour.setText("");
        ExHoli.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void menuSponsorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSponsorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSponsorTextFieldActionPerformed

    private void menuPanelExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPanelExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuPanelExitButtonActionPerformed

    private void menuPanelClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPanelClearButtonActionPerformed
       /* menuSponsorTextField.setText(" ");
        menuYearTextField.setText(" ");
        menuLocationTextField.setText(" ");
        menuVenueTextField.setText(" ");
        menuCurrencyTextField.setText(" ");
        menuDishTextField.setText(" ");
        menuEventTextField.setText(" ");
        menuOccasionTextField.setText(" "); */
    }//GEN-LAST:event_menuPanelClearButtonActionPerformed

    /* Joshua McKenzie 
    Search button in menu panel to pass values
    */
    
    
    private void menuPanelSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPanelSearchButtonActionPerformed
     
      /*  SearchParameters param = new SearchParameters();
      
        //brings in parameter class to pass methods to
        
        int[] year = new int [2];
        String aYear;
        int yearAsNumber;
        //Variables to pass year
        
        String aMenuID;
        int menuIDasNumber;
        //Variables to pass menuID
       
        String sponsor, event, venue, occasion, location, currency, dish;
        
        sponsor = menuSponsorTextField.getText();
        event = menuEventTextField.getText();
        venue = menuVenueTextField.getText();
        location = menuLocationTextField.getText();
        occasion = menuOccasionTextField.getText();
        currency = menuCurrencyTextField.getText();
        dish = menuDishTextField.getText();
        aMenuID = menuIDTextField.getText();
        aYear = menuYearTextField.getText();
        yearAsNumber = Integer.parseInt(aYear);
        year[0] = yearAsNumber;
        menuIDasNumber = Integer.parseInt(aMenuID);
        //Coverts Menu ID from String to int
        //Get user input and saves in local variables
        
        
        param.setSponsor(sponsor);
        param.setEvent(event);
        param.setVenue(venue);
        param.setPlace(location);
        param.setOccasion(occasion);
        param.setCurrency(currency);
        param.setDish(dish);
        param.setMenu_id(menuIDasNumber);
        param.setYear(year);
        //passes values to parameters class */
        
    }//GEN-LAST:event_menuPanelSearchButtonActionPerformed

    private void HoliFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoliFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoliFieldActionPerformed

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
            java.util.logging.Logger.getLogger(MenuSearchJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSearchJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSearchJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSearchJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSearchJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AllerField;
    private javax.swing.JButton ClearButton;
    private javax.swing.JTextField CourField;
    private javax.swing.JTextField CuiField;
    private javax.swing.JTextField DietField;
    private javax.swing.JTextField ExCour;
    private javax.swing.JTextField ExCui;
    private javax.swing.JTextField ExHoli;
    private javax.swing.JTextField ExIngre;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField FlavField;
    private javax.swing.JTextField HoliField;
    private javax.swing.JTextField IngreField;
    private javax.swing.JTextField NutriField;
    private javax.swing.JTextField PhraseField;
    private javax.swing.JTextField RecipeBox;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}