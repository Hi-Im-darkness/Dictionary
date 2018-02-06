package graphic;

public class TestViePronunPanel extends TestAbstractPanel {

    /**
     * Creates new form TestViePronunPanel
     */
    public TestViePronunPanel() {
        super();
    }

    @Override
    public void loadQuestion() {
        resLabel.setText("");
        hasAnswered = false;
        String[] listWord = SwingUtil.dict.rvs.randomWord(4);
        for (int i = 0; i < 4; i++) {
            listAnsButton.get(i).setText(SwingUtil.dict.rfc.simpleSearchWord(listWord[i]).getPronunciation());
            listAnsButton.get(i).setBackground(SwingUtil.background);
        }
        int i = SwingUtil.randomMachine.nextInt(4);
        String wordHasRevised = listWord[i];
        wordLabel.setText(SwingUtil.dict.rfc.simpleSearchWord(wordHasRevised).getMean());
        rightAnsButton = listAnsButton.get(i);
        SwingUtil.dict.his.add(wordHasRevised);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
