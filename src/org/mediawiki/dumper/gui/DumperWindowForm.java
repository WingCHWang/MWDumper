/*
 * DumperWindow.java
 *
 * Created on January 6, 2006, 2:11 PM
 */

package org.mediawiki.dumper.gui;

/**
 *
 * @author  brion
 */
public class DumperWindowForm extends javax.swing.JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9045740449396873205L;

	/** Creates new form DumperWindow */
	public DumperWindowForm() {
		initComponents();
	}
	
	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        schemaRadios = new javax.swing.ButtonGroup();
        filePanel = new javax.swing.JPanel();
        browseButton = new javax.swing.JButton();
        fileText = new javax.swing.JTextField();
        databasePanel = new javax.swing.JPanel();
        serverLabel = new javax.swing.JLabel();
        serverText = new javax.swing.JTextField();
        portLabel = new javax.swing.JLabel();
        portText = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        connectButton = new javax.swing.JButton();
        dbStatusLabel = new javax.swing.JLabel();
        dbTypeButton = new javax.swing.JComboBox();
        schemaPanel = new javax.swing.JPanel();
        schemaLabel = new javax.swing.JLabel();
        schema14Radio = new javax.swing.JRadioButton();
        schema15Radio = new javax.swing.JRadioButton();
        schema1_25Radio = new javax.swing.JRadioButton();
        prefixLabel = new javax.swing.JLabel();
        prefixText = new javax.swing.JTextField();
        dbnameLabel = new javax.swing.JLabel();
        dbnameText = new javax.swing.JTextField();
        schemaStatusLabel = new javax.swing.JLabel();
        progressPanel = new javax.swing.JPanel();
        progressLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        quitItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MediaWiki data dump importer");

        browseButton.setText("Browse...");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        fileText.setText("(no dump file selected)");
        fileText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fileTextFocusGained(evt);
            }
        });

        org.jdesktop.layout.GroupLayout filePanelLayout = new org.jdesktop.layout.GroupLayout(filePanel);
        filePanel.setLayout(filePanelLayout);
        filePanelLayout.setHorizontalGroup(
            filePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(filePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(fileText, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(browseButton)
                .addContainerGap())
        );
        filePanelLayout.setVerticalGroup(
            filePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(filePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(filePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fileText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        databasePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Database"));

        serverLabel.setText("Server");

        serverText.setText("localhost");

        portLabel.setText("Port");

        portText.setText("3306");

        userLabel.setText("User");

        userText.setText("root");

        passwordLabel.setText("Password");

        connectButton.setText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        dbStatusLabel.setText("Not connected.");

        dbTypeButton.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MySQL", "PostgreSQL" }));
        dbTypeButton.setToolTipText("Type of database to connect to");
        dbTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbTypeButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout databasePanelLayout = new org.jdesktop.layout.GroupLayout(databasePanel);
        databasePanel.setLayout(databasePanelLayout);
        databasePanelLayout.setHorizontalGroup(
            databasePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(databasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(databasePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(dbStatusLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(databasePanelLayout.createSequentialGroup()
                        .add(72, 72, 72)
                        .add(connectButton)
                        .add(51, 51, 51))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, databasePanelLayout.createSequentialGroup()
                        .add(passwordLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(passwordText))
                    .add(databasePanelLayout.createSequentialGroup()
                        .add(databasePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(userLabel)
                            .add(portLabel))
                        .add(44, 44, 44)
                        .add(databasePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(userText)
                            .add(portText)))
                    .add(databasePanelLayout.createSequentialGroup()
                        .add(serverLabel)
                        .add(34, 34, 34)
                        .add(databasePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(dbTypeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(serverText))))
                .addContainerGap())
        );
        databasePanelLayout.setVerticalGroup(
            databasePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, databasePanelLayout.createSequentialGroup()
                .add(databasePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(serverLabel)
                    .add(serverText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dbTypeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(databasePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(portText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(portLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(databasePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(userText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(userLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(databasePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(databasePanelLayout.createSequentialGroup()
                        .add(passwordText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(connectButton))
                    .add(passwordLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dbStatusLabel)
                .addContainerGap())
        );

        schemaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("MediaWiki schema"));

        schemaLabel.setText("Table layout for version");

        schemaRadios.add(schema14Radio);
        schema14Radio.setText("1.4 (cur, old)");
        schema14Radio.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        schema14Radio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        schema14Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schema14RadioActionPerformed(evt);
            }
        });

        schemaRadios.add(schema15Radio);
        schema15Radio.setText("1.5 (page, revision, text)");
        schema15Radio.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        schema15Radio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        schema15Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schema15RadioActionPerformed(evt);
            }
        });

        schemaRadios.add(schema1_25Radio);
        schema1_25Radio.setSelected(true);
        schema1_25Radio.setText("1.25 (page, revision, text)");
        schema1_25Radio.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        schema1_25Radio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        schema1_25Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSchema1_25RadioActionPerformed(evt);
            }
        });

        prefixLabel.setText("Table prefix");

        dbnameLabel.setText("Database");

        dbnameText.setText("wikidb");
        dbnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbnameTextActionPerformed(evt);
            }
        });

        schemaStatusLabel.setText("Not connected.");

        org.jdesktop.layout.GroupLayout schemaPanelLayout = new org.jdesktop.layout.GroupLayout(schemaPanel);
        schemaPanel.setLayout(schemaPanelLayout);
        schemaPanelLayout.setHorizontalGroup(
            schemaPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(schemaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(schemaPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(schemaPanelLayout.createSequentialGroup()
                        .add(schemaStatusLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(schemaPanelLayout.createSequentialGroup()
                        .add(schemaPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(prefixLabel)
                            .add(dbnameLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(schemaPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(dbnameText, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .add(prefixText, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .add(105, 105, 105))
                    .add(schemaPanelLayout.createSequentialGroup()
                        .add(schemaPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(schema15Radio)
                            .add(schema14Radio)
                            .add(schemaLabel)
                            .add(schema1_25Radio))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        schemaPanelLayout.setVerticalGroup(
            schemaPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(schemaPanelLayout.createSequentialGroup()
                .add(59, 59, 59)
                .add(schemaLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(schema14Radio)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(schema15Radio)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(schema1_25Radio)
                .add(18, 18, 18)
                .add(schemaPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(prefixLabel)
                    .add(prefixText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(schemaPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(dbnameLabel)
                    .add(dbnameText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(schemaStatusLabel)
                .addContainerGap())
        );

        progressLabel.setText("Select a file...");

        startButton.setText("Start import");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout progressPanelLayout = new org.jdesktop.layout.GroupLayout(progressPanel);
        progressPanel.setLayout(progressPanelLayout);
        progressPanelLayout.setHorizontalGroup(
            progressPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(progressPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(progressLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 383, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 140, Short.MAX_VALUE)
                .add(startButton)
                .addContainerGap())
        );
        progressPanelLayout.setVerticalGroup(
            progressPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(progressPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(progressPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(progressLabel)
                    .add(startButton))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        quitItem.setText("Quit");
        quitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitItemActionPerformed(evt);
            }
        });
        fileMenu.add(quitItem);

        mainMenuBar.add(fileMenu);

        setJMenuBar(mainMenuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, progressPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, filePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(databasePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 111, Short.MAX_VALUE)
                        .add(schemaPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(filePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(schemaPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(databasePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(6, 6, 6)
                .add(progressPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fileTextFocusGained
        fileText.selectAll();
    }//GEN-LAST:event_fileTextFocusGained

    private void dbTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbTypeButtonActionPerformed
                onDbTypeButtonActionPerformed(evt);
    }//GEN-LAST:event_dbTypeButtonActionPerformed

	private void schema15RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schema15RadioActionPerformed
		onSchema15RadioActionPerformed(evt); // i hate you, netbeans gui editor
	}//GEN-LAST:event_schema15RadioActionPerformed

	private void schema14RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schema14RadioActionPerformed
		onSchema14RadioActionPerformed(evt); // i hate you, netbeans gui editor
	}//GEN-LAST:event_schema14RadioActionPerformed

	private void dbnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbnameTextActionPerformed
		onDbnameTextActionPerformed(evt); // i hate you, netbeans gui editor
	}//GEN-LAST:event_dbnameTextActionPerformed

	private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
		onBrowseButtonActionPerformed(evt); // i hate you, netbeans gui editor
	}//GEN-LAST:event_browseButtonActionPerformed

	private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
		onStartButtonActionPerformed(evt); // i hate you, netbeans gui editor
	}//GEN-LAST:event_startButtonActionPerformed

	private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
		onConnectButtonActionPerformed(evt); // i hate you, netbeans gui editor
	}//GEN-LAST:event_connectButtonActionPerformed

	private void quitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitItemActionPerformed
		onQuitItemActionPerformed(evt); // i hate you, netbeans gui editor
	}//GEN-LAST:event_quitItemActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DumperWindowForm().setVisible(true);
			}
		});
	}
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton browseButton;
    protected javax.swing.JButton connectButton;
    protected javax.swing.JPanel databasePanel;
    protected javax.swing.JLabel dbStatusLabel;
    protected javax.swing.JComboBox dbTypeButton;
    protected javax.swing.JLabel dbnameLabel;
    protected javax.swing.JTextField dbnameText;
    protected javax.swing.JMenu fileMenu;
    protected javax.swing.JPanel filePanel;
    protected javax.swing.JTextField fileText;
    protected javax.swing.JMenuBar mainMenuBar;
    protected javax.swing.JLabel passwordLabel;
    protected javax.swing.JPasswordField passwordText;
    protected javax.swing.JLabel portLabel;
    protected javax.swing.JTextField portText;
    protected javax.swing.JLabel prefixLabel;
    protected javax.swing.JTextField prefixText;
    protected javax.swing.JLabel progressLabel;
    protected javax.swing.JPanel progressPanel;
    protected javax.swing.JMenuItem quitItem;
    protected javax.swing.JRadioButton schema14Radio;
    protected javax.swing.JRadioButton schema15Radio;
    protected javax.swing.JRadioButton schema1_25Radio;
    protected javax.swing.JLabel schemaLabel;
    protected javax.swing.JPanel schemaPanel;
    protected javax.swing.ButtonGroup schemaRadios;
    protected javax.swing.JLabel schemaStatusLabel;
    protected javax.swing.JLabel serverLabel;
    protected javax.swing.JTextField serverText;
    protected javax.swing.JButton startButton;
    protected javax.swing.JLabel userLabel;
    protected javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
	
	protected void onStartButtonActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
	}

	protected void onConnectButtonActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
	}

	protected void onBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
	}

	protected void onQuitItemActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
	}                                        

	protected void onDbnameTextActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
	}

	protected void onSchema14RadioActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
	}

	protected void onSchema15RadioActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
	}

    protected void onSchema1_25RadioActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
	

    public javax.swing.JButton getBrowseButton() {
        return browseButton;
    }
        
        protected void onDbTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {
            
        }

}
