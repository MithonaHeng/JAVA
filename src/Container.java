
import java.awt.*;
import java.awt.event.*;

  class ContainerEventDM extends Frame implements    
                        ContainerListener, ActionListener {
       ContainerEventDM() {
           super("ContainerEvent Example");
           Button b = new Button("New Button");

           // Listen for events.
           b.addActionListener(this);
           addContainerListener(this);
           addWindowListener(new WindowAdapter(){
                 public void windowClosing(WindowEvent we){
                     System.exit(0);
                 }
            });
            // Layout component
            setLayout(new FlowLayout());
            add(b);        
            setBounds(250, 210, 150, 100);
            setVisible(true);
     }
     // Container event handler methods
     public void componentAdded(ContainerEvent evt) {
           System.out.println("COMPONENT_ADDED: "+evt.getChild());
           System.out.println(" There are now " + 
                           evt.getContainer().getComponentCount() + " children.");
     }
     public void componentRemoved(ContainerEvent evt) {
          System.out.println("COMPONENT_REMOVED: "+evt.getChild());
          System.out.println(" There are now " +
                        evt.getContainer().getComponentCount() + " children.");
     }    
     // This increasing number is used in naming 
     // the new buttons.
     int count=0;

     // Action event handler method
     public void actionPerformed(ActionEvent evt) {        
       if (evt.getActionCommand().equals("New Button")) {
          // Add a button.
          Button b = new Button("Remove Me "+(++count));
   
          // Listen for events.
          b.addActionListener(this);
          add(b);
          validate(); // relayout container

       }else if(evt.getActionCommand().startsWith("Remove Me")){
             // Remove a button.
             remove((Component)evt.getSource());
             validate(); // relayout container
        }
     }
     public static void main(String args[]) {
       new ContainerEventDM();
     }
  }