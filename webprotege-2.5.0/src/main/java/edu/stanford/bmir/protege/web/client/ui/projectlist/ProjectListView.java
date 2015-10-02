package edu.stanford.bmir.protege.web.client.ui.projectlist;

import com.google.gwt.event.logical.shared.HasSelectionHandlers;
import com.google.gwt.user.client.ui.IsWidget;
import edu.stanford.bmir.protege.web.client.ui.projectmanager.HasBundleRequestHandler;
import edu.stanford.bmir.protege.web.client.ui.projectmanager.HasConvertAndReturnRequestHandler;
import edu.stanford.bmir.protege.web.client.ui.projectmanager.HasDownloadProjectRequestHandler;
import edu.stanford.bmir.protege.web.client.ui.projectmanager.HasLoadProjectRequestHandler;
import edu.stanford.bmir.protege.web.client.ui.projectmanager.HasTrashManagerRequestHandler;
import edu.stanford.bmir.protege.web.shared.project.ProjectDetails;
import edu.stanford.bmir.protege.web.shared.project.ProjectId;

import java.util.List;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 01/04/2013
 */
public interface ProjectListView extends IsWidget, HasBundleRequestHandler,HasSelectionHandlers<ProjectId>, HasLoadProjectRequestHandler, HasDownloadProjectRequestHandler, HasTrashManagerRequestHandler, HasConvertAndReturnRequestHandler {

    void setListData(List<ProjectDetails> projectDetails);

    void addListData(ProjectDetails projectDetails);

    void setSelectedProject(ProjectId project);
}
