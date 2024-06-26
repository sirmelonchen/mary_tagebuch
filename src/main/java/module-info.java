module de.sirmelonchen.mary_tagebuch_fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens de.sirmelonchen.mary_tagebuch_fx to javafx.fxml;
    exports de.sirmelonchen.mary_tagebuch_fx;
}