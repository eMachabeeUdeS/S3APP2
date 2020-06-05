package Controllers;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import models.Fichier;
import models.Forme;
import models.FormeFactory;
import models.FormeFactory.eForme;
import models.FormeFactoryEnergy;
import models.FormeFactoryInversion;
import models.FormeFactoryModel;
import models.FormeFactoryStrategy;
import models.Modele;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class gestionBoutonsToolbar {
	FormeFactory inversion = new FormeFactoryInversion();
	FormeFactory energy = new FormeFactoryEnergy();
	FormeFactory strategy = new FormeFactoryStrategy();
	FormeFactory model = new FormeFactoryModel();
	String typeForme;
	String couleursForme;
	double coordonneeXDebutFleche;
	double coordonneeYDebutFleche;
	Deque<Modele> stackModele = new ArrayDeque<Modele>();
	Fichier fichier;
	
	Forme aForme;
	GraphicsContext aGC;
	
	@FXML
	private Ellipse shape_source;
	
	@FXML
	private Scene topScene;
	
	@FXML
	private Canvas leCanvas;
	
	@FXML
	private Rectangle carre_energy;
	
	@FXML
	private Circle cercle_energy;
	
	@FXML
	private Circle double_cercle_energy;
	
	@FXML
	private Rectangle double_carre_energy;
	
	@FXML
	private Rectangle carre_sup_energy;
	
	@FXML
	private Rectangle carre_inf_energy;
	
	@FXML
	private Rectangle rectangle_barre_energy;
	
	@FXML
	private MenuButton buttonItemSelected;
	
	@FXML
	private Label state_id;
	
	@FXML
	private Button buttonSave;
	
	@FXML
	private Button buttonLoad;
	
	@FXML
	void btnLoadClick(ActionEvent event) {
		JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	 fileChooser.setDialogTitle("Choose a file");
	 fileChooser.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("XML or TXT File", "xml", "txt");
	 fileChooser.addChoosableFileFilter(filter);
		
		
		int fileChooserStatus = fileChooser.showOpenDialog(null);
		
		if (fileChooserStatus == JFileChooser.APPROVE_OPTION) {
			File fileChoosed = fileChooser.getSelectedFile();
			
					String path = fileChoosed.getAbsolutePath();
					String extension = path.substring(path.lastIndexOf(".") + 1, path.length());
					String fileName = fileChoosed.getName();
					
					if (extension.equalsIgnoreCase("xml"))
					{
						fichier = new Fichier();
						fichier.setTypeFichierXML(path);
						aGC = leCanvas.getGraphicsContext2D();
						stackModele = fichier.lireFichier(aGC, leCanvas.getWidth(), leCanvas.getHeight());
					}
					
					if (extension.equalsIgnoreCase("txt"))
					{
						fichier = new Fichier();
						fichier.setTypeFichierTXT(path);
						aGC = leCanvas.getGraphicsContext2D();
						stackModele = fichier.lireFichier(aGC, leCanvas.getWidth(), leCanvas.getHeight());
					}
					else
					{
						return;
					}
		}
		
	}
	
	@FXML
	void btnSaveClick(ActionEvent event) {
		JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	 fileChooser.setDialogTitle("Choose a file");
	 fileChooser.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("XML or TXT File", "xml", "txt");
	 fileChooser.addChoosableFileFilter(filter);
		
		
		int fileChooserStatus = fileChooser.showSaveDialog(null);
		
		if (fileChooserStatus == JFileChooser.APPROVE_OPTION) {
			File fileChoosed = fileChooser.getSelectedFile();
			
					String path = fileChoosed.getAbsolutePath();
					String extension = path.substring(path.lastIndexOf(".") + 1, path.length());
					String fileName = fileChoosed.getName();
					
					if (extension.equalsIgnoreCase("xml"))
					{
						fichier = new Fichier();
						fichier.setTypeFichierXML(path);
						fichier.ecrireFichier(stackModele);
					}
					
					if (extension.equalsIgnoreCase("txt"))
					{
						fichier = new Fichier();
						fichier.setTypeFichierTXT(path);
						fichier.ecrireFichier(stackModele);
					}
					else
					{
						return;
					}
				}
		}
	
	@FXML
	void CarreEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = carre_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("carre_energy");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.CARRE);
		typeForme = "carre";
		couleursForme = "energy";
		event.consume();
	}
	
	@FXML
	void CercleEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = cercle_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("cercle_energy");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.CERCLE);
		typeForme = "cercle";
		couleursForme = "energy";
		event.consume();
	}
	
	@FXML
	void RectangleBarreEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = rectangle_barre_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("rectangle_energy");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.RECTANGLE);
		typeForme = "rectangle_barre";
		couleursForme = "energy";
		event.consume();
	}
	
	@FXML
	void deuxCerclesEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = double_cercle_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("double_cercle");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.CERCLE);
		typeForme = "double_cercle";
		couleursForme = "energy";
		event.consume();
	}
	
	@FXML
	void deuxCarresEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = double_carre_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("double_carre");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.CARRE);
		typeForme = "double_carre";
		couleursForme = "energy";
		event.consume();
	}
	
	@FXML
	void carreInfEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = carre_inf_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("carre_inf");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.CARRE);
		typeForme = "carre_inf";
		couleursForme = "energy";
		event.consume();	
	}
	
	@FXML
	void carreSupEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = carre_sup_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("carre_sup");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.CARRE);
		typeForme = "carre_sup";
		couleursForme = "energy";
		event.consume();
	}
	
	@FXML
	void sourceDragDetected(MouseEvent event) {
		Dragboard dragboard = shape_source.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("source");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.SOURCE);
		typeForme = "source";
		couleursForme = "source";
		event.consume();
	}
	
	@FXML
	void CanvasDragDrop(DragEvent event) {
		aGC = leCanvas.getGraphicsContext2D();		
		aGC.setFill(aForme.getCouleur());
		aGC.setStroke(aForme.getBordure());
		if(typeForme == "carre")
		{
			aGC.strokeRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.fillRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.setFill(aForme.getBordure());
			aGC.fillOval(event.getX()-5, event.getY()+aForme.getHauteur()/2-4, 10, 10);
			aGC.fillOval(event.getX()+aForme.getHauteur()-5, event.getY()+aForme.getHauteur()/2-4, 10, 10);
		}
		else if(typeForme == "cercle")
		{
			aGC.strokeOval(event.getX(), event.getY(), aForme.getRayon()*2, aForme.getRayon()*2);
			aGC.fillOval(event.getX(), event.getY(), aForme.getRayon()*2, aForme.getRayon()*2);
			aGC.setFill(aForme.getBordure());
			aGC.fillOval(event.getX()-5, event.getY()+aForme.getRayon()-5, 10, 10);
			aGC.fillOval(event.getX()+aForme.getRayon()*2-5, event.getY()+aForme.getRayon()-5, 10, 10);
		}
		else if(typeForme == "double_carre")
		{
			aGC.strokeRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.fillRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.strokeRect(event.getX()+15, event.getY()+15, aForme.getHauteur(), aForme.getLargeur());
			aGC.fillRect(event.getX()+15, event.getY()+15, aForme.getHauteur(), aForme.getLargeur());
			aGC.setFill(aForme.getBordure());
			aGC.fillOval(event.getX()-5, event.getY()+aForme.getHauteur()-5, 10, 10);
			aGC.fillOval(event.getX()+10+aForme.getHauteur(), event.getY()+aForme.getHauteur()-5, 10, 10);
		}
		else if(typeForme == "double_cercle")
		{
			aGC.strokeOval(event.getX(), event.getY(), aForme.getRayon()*2, aForme.getRayon()*2);
			aGC.fillOval(event.getX(), event.getY(), aForme.getRayon()*2, aForme.getRayon()*2);
			aGC.strokeOval(event.getX()+10, event.getY()+10, aForme.getRayon()*2, aForme.getRayon()*2);
			aGC.fillOval(event.getX()+10, event.getY()+10, aForme.getRayon()*2, aForme.getRayon()*2);
			aGC.setFill(aForme.getBordure());
			aGC.fillOval(event.getX()-5, event.getY()+aForme.getRayon()-5, 10, 10);
			aGC.fillOval(event.getX()+aForme.getRayon()*2+5, event.getY()+aForme.getRayon(), 10, 10);
		}
		else if(typeForme == "rectangle_barre")
		{
			aGC.strokeRect(event.getX(), event.getY(), aForme.getLargeur(), aForme.getHauteur());
			aGC.fillRect(event.getX(), event.getY(), aForme.getLargeur(), aForme.getHauteur());
			aGC.strokeLine(event.getX(), event.getY()+aForme.getHauteur(), event.getX()+aForme.getLargeur(), event.getY());
			aGC.setFill(aForme.getBordure());
			aGC.fillOval(event.getX()-5, event.getY()+aForme.getHauteur()/2-4, 10, 10);
			aGC.fillOval(event.getX()+aForme.getLargeur()-5, event.getY()+aForme.getHauteur()/2-4, 10, 10);
		}
		else if(typeForme == "source")
		{
			aGC.strokeOval(event.getX(), event.getY(), aForme.getLargeur(), aForme.getHauteur());
			aGC.fillOval(event.getX(), event.getY(), aForme.getLargeur(), aForme.getHauteur());
			aGC.strokeText("Source", event.getX()+aForme.getHauteur()/2, event.getY()+aForme.getHauteur()/2);
			aGC.setFill(aForme.getBordure());
			aGC.fillOval(event.getX()-5, event.getY()+aForme.getHauteur()/2-5, 10,10);
			aGC.fillOval(event.getX()-5+aForme.getLargeur(), event.getY()+aForme.getHauteur()/2-5, 10, 10);
			aGC.fillOval(event.getX()-5+aForme.getLargeur()/2, event.getY()-5+aForme.getHauteur(), 10, 10);
			aGC.fillOval(event.getX()-5+aForme.getLargeur()/2, event.getY()-5, 10, 10);
		}
		else if(typeForme == "carre_sup")
		{
			aGC.strokeRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.fillRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.strokeLine(event.getX(), event.getY(), event.getX()+aForme.getHauteur(), event.getY()+aForme.getHauteur()/2);
			aGC.strokeLine(event.getX(), event.getY()+aForme.getHauteur(), event.getX()+aForme.getHauteur(), event.getY()+aForme.getHauteur()/2);
			aGC.setFill(aForme.getBordure());
			aGC.fillOval(event.getX()-5, event.getY()-5, 10, 10);
			aGC.fillOval(event.getX()-5, event.getY()+aForme.getHauteur()-5, 10, 10);
			aGC.fillOval(event.getX()+aForme.getHauteur()-5, event.getY()+aForme.getHauteur()/2-4, 10, 10);
		}
		else if(typeForme == "carre_inf")
		{
			aGC.strokeRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.fillRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.strokeLine(event.getX()+aForme.getHauteur(), event.getY(), event.getX(), event.getY()+aForme.getHauteur()/2);
			aGC.strokeLine(event.getX()+aForme.getHauteur(), event.getY()+aForme.getHauteur(), event.getX(), event.getY()+aForme.getHauteur()/2);
			aGC.setFill(aForme.getBordure());
			aGC.fillOval(event.getX()-5+aForme.getHauteur(), event.getY()-5, 10, 10);
			aGC.fillOval(event.getX()-5+aForme.getHauteur(), event.getY()+aForme.getHauteur()-5, 10, 10);
			aGC.fillOval(event.getX()-5, event.getY()+aForme.getHauteur()/2-4, 10, 10);
		}
		Modele m = new Modele();
		m.setTypeForme(typeForme);
		m.setAnchorX1(event.getX());
		m.setAnchorY1(event.getY());
		m.setCouleursForme(couleursForme);
		stackModele.add(m);
		typeForme = null;
		aForme = null;
	}
	
	@FXML
	void SceneDragOver(DragEvent event) {
		event.acceptTransferModes(TransferMode.ANY);
		event.consume();
	}
	
	@FXML
	void CanvasDragOver(DragEvent event) {
		event.acceptTransferModes(TransferMode.ANY);
		event.consume();
	}
	
	@FXML
	void CanvasMousePressed(MouseEvent event) {//Pour dessiner une flèche
		WritableImage image = leCanvas.snapshot(new SnapshotParameters(), null);
		Color color = image.getPixelReader().getColor((int) event.getX(), (int) event.getY());
		if(color.equals(Color.RED)) {
			coordonneeXDebutFleche = event.getX();
			coordonneeYDebutFleche = event.getY();
		}
	}
	
	@FXML
	void CanvasMouseReleased(MouseEvent event) {
		WritableImage image = leCanvas.snapshot(new SnapshotParameters(), null);
		Color color = image.getPixelReader().getColor((int) event.getX(), (int) event.getY());
		if(color.equals(Color.RED)) {
			Modele m = new Modele();
			m.setTypeForme("fleche");
			m.setAnchorX1(coordonneeXDebutFleche);
			m.setAnchorY1(coordonneeYDebutFleche);
			m.setAnchorX2(event.getX());
			m.setAnchorY2(event.getY());
			stackModele.add(m);
			aGC = leCanvas.getGraphicsContext2D();	
			aGC.setStroke(Color.BLACK);
			aGC.strokeLine(coordonneeXDebutFleche, coordonneeYDebutFleche, event.getX(), event.getY());
		}
	}
	
}