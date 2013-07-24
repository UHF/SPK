package spk.core.ui.swt.views;

import org.eclipse.scout.rt.ui.swt.ISwtEnvironment;
import org.eclipse.scout.rt.ui.swt.window.desktop.view.AbstractScoutView;

import spk.core.ui.swt.Activator;

public class SouthView extends AbstractScoutView {

  public SouthView() {
  }

  @Override
  protected ISwtEnvironment getSwtEnvironment() {
    return Activator.getDefault().getEnvironment();
  }
}