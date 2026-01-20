package org.wso2.carbon.ui;

import org.apache.tiles.startup.TilesInitializer;
import org.apache.tiles.web.startup.AbstractTilesListener;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

import javax.servlet.ServletContextListener;

@Component(
        service = ServletContextListener.class,
        property = {
                HttpWhiteboardConstants.HTTP_WHITEBOARD_LISTENER + "=true",
                HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT + "=(" + HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME + "=carbonContext)"
        }
)
public class CustomTilesInitializerListener extends AbstractTilesListener {

    @Override
    protected TilesInitializer createTilesInitializer() {

        return new CustomTilesInitializer();
    }
}

