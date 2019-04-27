package CsBaseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SEmptyContainmentSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class AssignmentExpression_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public AssignmentExpression_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_0();
  }

  private EditorCell createCollection_0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_o50b7_a");
    editorCell.setBig(true);
    setCellContext(editorCell);
    editorCell.addEditorCell(createRefNode_0());
    editorCell.addEditorCell(createComponent_0());
    editorCell.addEditorCell(createRefNode_1());
    return editorCell;
  }
  private EditorCell createRefNode_0() {
    SingleRoleCellProvider provider = new AssignmentExpression_EditorBuilder_a.leftSideSingleRoleHandler_o50b7_a0(myNode, MetaAdapterFactory.getContainmentLink(0xd74e25c94d9143b6L, 0xbad7d18af7bf6674L, 0x2b6e5dd872dba7daL, 0x2b6e5dd872dba7ddL, "leftSide"), getEditorContext());
    return provider.createCell();
  }
  private static class leftSideSingleRoleHandler_o50b7_a0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public leftSideSingleRoleHandler_o50b7_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xd74e25c94d9143b6L, 0xbad7d18af7bf6674L, 0x2b6e5dd872dba7daL, 0x2b6e5dd872dba7ddL, "leftSide"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xd74e25c94d9143b6L, 0xbad7d18af7bf6674L, 0x2b6e5dd872dba7daL, 0x2b6e5dd872dba7ddL, "leftSide"), child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(MetaAdapterFactory.getContainmentLink(0xd74e25c94d9143b6L, 0xbad7d18af7bf6674L, 0x2b6e5dd872dba7daL, 0x2b6e5dd872dba7ddL, "leftSide"));
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xd74e25c94d9143b6L, 0xbad7d18af7bf6674L, 0x2b6e5dd872dba7daL, 0x2b6e5dd872dba7ddL, "leftSide")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_leftSide");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no leftSide>";
    }
  }
  private EditorCell createComponent_0() {
    EditorCell editorCell = getCellFactory().createEditorComponentCell(myNode, "jetbrains.mps.lang.core.editor.alias");
    return editorCell;
  }
  private EditorCell createRefNode_1() {
    SingleRoleCellProvider provider = new AssignmentExpression_EditorBuilder_a.rightSideSingleRoleHandler_o50b7_c0(myNode, MetaAdapterFactory.getContainmentLink(0xd74e25c94d9143b6L, 0xbad7d18af7bf6674L, 0x2b6e5dd872dba7daL, 0x2b6e5dd872dba7dfL, "rightSide"), getEditorContext());
    return provider.createCell();
  }
  private static class rightSideSingleRoleHandler_o50b7_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public rightSideSingleRoleHandler_o50b7_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xd74e25c94d9143b6L, 0xbad7d18af7bf6674L, 0x2b6e5dd872dba7daL, 0x2b6e5dd872dba7dfL, "rightSide"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xd74e25c94d9143b6L, 0xbad7d18af7bf6674L, 0x2b6e5dd872dba7daL, 0x2b6e5dd872dba7dfL, "rightSide"), child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(MetaAdapterFactory.getContainmentLink(0xd74e25c94d9143b6L, 0xbad7d18af7bf6674L, 0x2b6e5dd872dba7daL, 0x2b6e5dd872dba7dfL, "rightSide"));
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xd74e25c94d9143b6L, 0xbad7d18af7bf6674L, 0x2b6e5dd872dba7daL, 0x2b6e5dd872dba7dfL, "rightSide")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_rightSide");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no rightSide>";
    }
  }
}
