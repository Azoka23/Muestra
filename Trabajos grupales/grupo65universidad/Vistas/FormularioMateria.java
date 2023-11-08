package grupo65universidad.Vistas;

import grupo65universidad.AccesoADatos.MateriaDAO;
import grupo65universidad.Entidades.Materia;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.JButton;

public class FormularioMateria extends javax.swing.JInternalFrame {
    
    private JButton botonAnterior = null; // Variable para almacenar el botón anterior

    /**
     * Creates new form InfoMateria
     */
    public FormularioMateria() {
        initComponents();
        setTitle("Cargar Materia");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCodigo = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLNombre = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLAño = new javax.swing.JLabel();
        jTYear = new javax.swing.JTextField();
        jRBEstado = new javax.swing.JRadioButton();
        jLEstado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));
        setClosable(true);
        setTitle("Materia");

        jLCodigo.setText("   Codigo");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLNombre.setText("  Nombre");

        jLAño.setText("  Año");

        jRBEstado.setBackground(new java.awt.Color(0, 51, 51));

        jLEstado.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBBuscar)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLAño, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBEstado)
                            .addComponent(jTYear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAño)
                    .addComponent(jTYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBEstado)
                    .addComponent(jLEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        limpiar();
        botonAnterior = jBNuevo;
        try {
            jTCodigo.setText(ultimoRegistro() + "");
            
        } catch (SQLException ex) {
            Utilidades.mostrarError(ex,this);
        } catch (Exception ex) {
            Utilidades.mostrarError(ex,this);
        }
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        
        try {
            if (camposVacios()) {
                JOptionPane.showMessageDialog(this, "No debe dejar algun dato vacio");
            } else {
                
                guardar();
                limpiar();
                
            }
            
        } catch (Exception ex) {
            Utilidades.mostrarError(ex,this);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        if (jTCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes escribir un Codigo");
            
        } else {
            limpiarBuscar();
            botonAnterior = jBBuscar;
            buscarxCodigo();
            
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        try {
            eliminadologico();
        } catch (ClassNotFoundException | SQLException ex) {
            Utilidades.mostrarError(ex,this);
        }

    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        salirAplicacion();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLAño;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTYear;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        Utilidades.limpiarSetText(jTCodigo, jTNombre, jTYear);
        jRBEstado.setSelected(false);
        botonAnterior = null;
        
    }
    
    private void limpiarBuscar() {
        Utilidades.limpiarSetText(jTNombre, jTYear);

    }
    
    private void eliminadologico() throws ClassNotFoundException, SQLException {
        if (botonAnterior == jBBuscar) {
            MateriaDAO materiaD = new MateriaDAO();
            
            int codigo = Integer.parseInt(jTCodigo.getText());
            
            try {
                materiaD.eliminarLogico(codigo);
                JOptionPane.showMessageDialog(this, "la materia fue dada de baja");
                limpiar();
            } catch (Exception ex) {
                Utilidades.mostrarError(ex,this);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número de codigo que exista.");
        }
    }
    
    private void buscarxCodigo() {
        try {
            int codigo = Integer.parseInt(jTCodigo.getText());
            
            MateriaDAO materiaDao = new MateriaDAO();
            Materia materia = materiaDao.buscarListaMateriaxDni(codigo);
            
            if (materia != null) {
                jTNombre.setText(materia.getNombre());
                jTYear.setText(String.valueOf(materia.getAnio()));
                setTitle("Cargar Materia" + (materia.isEstado() ? "" : " -- Codigo dado de Baja"));
                jRBEstado.setSelected(materia.isEstado());
            } else {
                botonAnterior = jBNuevo;
                JOptionPane.showMessageDialog(this, "No se encontró el codigo,el codigo disponible es " + ultimoRegistro());
                jTCodigo.setText(ultimoRegistro() + "");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: El código debe ser un número valido.");
        } catch (Exception ex) {
            Utilidades.mostrarError(ex,this);
        }
    }
    
    private void guardar() {
        int codigo = 0;
        int year = 0;
        try {
            codigo = Integer.parseInt(jTCodigo.getText());
            String nombre = jTNombre.getText();
            year = Integer.parseInt(jTYear.getText());
            boolean estado = jRBEstado.isSelected();
            
            MateriaDAO materiaD = new MateriaDAO();
            Materia materia = new Materia(codigo, nombre, year, estado);
            
            if (botonAnterior == jBNuevo) {
                 materia.setEstado(true);
                materiaD.guardarMateria(materia);
            } else {
                materia.setEstado(true);
                
                materiaD.modificarMateria(materia);
            }
        } catch (NumberFormatException ex) {
            Utilidades.mostrarError(ex,this);
        } catch (Exception ex) {
            Utilidades.mostrarError(ex,this);
        }
    }
    
    private int ultimoRegistro() throws ClassNotFoundException, SQLException, Exception {
        MateriaDAO materiaD = new MateriaDAO();
        return materiaD.contarTotalRegistros();
        
    }
    
    private void salirAplicacion() {
        if (Utilidades.confirmarSalida(this)) {
            dispose();
        }
    }

    private boolean camposVacios() {
        return jTCodigo.getText().isEmpty() || jTNombre.getText().isEmpty() || jTYear.getText().isEmpty();
    }
}