/***************************************************************************
 * Bytecode Viewer (BCV) - Java & Android Reverse Engineering Suite        *
 * Copyright (C) 2014 Konloch - Konloch.com / BytecodeViewer.com           *
 *                                                                         *
 * This program is free software: you can redistribute it and/or modify    *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation, either version 3 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>. *
 ***************************************************************************/

package the.bytecode.club.bytecodeviewer.translation;

/**
 * Translation keys for components (updates the component text on language change).
 * <p>
 * You only need to add a translation key if it is going to be used by a component.
 * If your translation is not tied to a component (Console, Dialogs) use TranslatedStrings
 *
 * @author Konloch
 * @since 6/28/2021
 */

public enum TranslatedComponents
{
    FILE,
    ADD,
    NEW_WORKSPACE,
    RELOAD_RESOURCES,
    RUN,
    OPEN,
    COMPILE,
    SAVE,
    SAVE_AS,
    SAVE_AS_RUNNABLE_JAR,
    SAVE_AS_ZIP,
    SAVE_AS_DEX,
    SAVE_AS_APK,
    DECOMPILE_SAVE_OPENED_CLASSES,
    DECOMPILE_SAVE_ALL_CLASSES,
    RECENT_FILES,
    ABOUT,
    EXIT,

    VIEW,
    VISUAL_SETTINGS,
    LANGUAGE,
    WINDOW_THEME,
    SYSTEM_THEME,
    DARK_THEME,
    LIGHT_THEME,
    ONE_DARK_THEME,
    SOLARIZED_DARK_THEME,
    SOLARIZED_LIGHT_THEME,
    HIGH_CONTRAST_DARK_THEME,
    HIGH_CONTRAST_LIGHT_THEME,
    DARK,
    ONE_DARK,
    SOLARIZED_DARK,
    SOLARIZED_LIGHT,
    HIGH_CONTRAST_DARK,
    HIGH_CONTRAST_LIGHT,

    TEXT_AREA_THEME,
    DEFAULT_RECOMMENDED_LIGHT,
    THEME_MATCH,
    DARK_ALT,
    DEFAULT_ALT,
    ECLIPSE,
    INTELLIJ,
    VISUAL_STUDIO,
    DRUID_DARK,
    MONOKAI_DARK,

    FONT_SIZE,
    SHOW_TAB_FILE_IN_TAB_TITLE,
    SIMPLIFY_NAME_IN_TAB_TITLE,
    SYNCHRONIZED_VIEWING,
    SHOW_CLASS_METHODS,

    PANE_1,
    PANE_2,
    PANE_3,
    NONE,
    EDITABLE,
    JAVA,
    BYTECODE,
    HEXCODE,
    ASM_TEXTIFY,
    ASMIFIER,

    SETTINGS,
    COMPILE_ON_SAVE,
    COMPILE_ON_REFRESH,
    REFRESH_ON_VIEW_CHANGE,
    DISABLE_RELOAD_CONFIRMATION,
    DECODE_APK_RESOURCES,
    APK_CONVERSION,
    APK_CONVERSION_DECODING,
    UPDATE_CHECK,
    DELETE_UNKNOWN_LIBS,
    FORCE_PURE_ASCII_AS_TEXT,
    SET_PYTHON_27_EXECUTABLE,
    SET_PYTHON_30_EXECUTABLE,
    SET_JRE_RT_LIBRARY,
    SET_OPTIONAL_LIBRARY_FOLDER,
    SET_JAVAC_EXECUTABLE,
    BYTECODE_DECOMPILER,
    DEBUG_HELPERS,
    APPEND_BRACKETS_TO_LABEL,

    PLUGINS,
    OPEN_PLUGIN,
    RECENT_PLUGINS,
    NEW_JAVA_PLUGIN,
    NEW_JAVASCRIPT_PLUGIN,
    CODE_SEQUENCE_DIAGRAM,
    MALICIOUS_CODE_SCANNER,
    SHOW_MAIN_METHODS,
    SHOW_ALL_STRINGS,
    REPLACE_STRINGS,
    STACK_FRAMES_REMOVER,
    ZKM_STRING_DECRYPTER,
    ALLATORI_STRING_DECRYPTER,
    ZSTRINGARRAY_DECRYPTER,


    HIDE_BRIDGE_METHODS,
    HIDE_SYNTHETIC_CLASS_MEMBERS,
    DECOMPILE_INNER_CLASSES,
    COLLAPSE_14_CLASS_REFERENCES,
    DECOMPILE_ASSERTIONS,
    HIDE_EMPTY_SUPER_INVOCATION,
    HIDE_EMPTY_DEFAULT_CONSTRUCTOR,
    DECOMPILE_GENERIC_SIGNATURES,
    ASSUME_RETURN_NOT_THROWING_EXCEPTIONS,
    DECOMPILE_ENUMERATIONS,
    REMOVE_GETCLASS_INVOCATION,
    INTERPRET_INT_1_AS_BOOLEAN_TRUE,
    ALLOW_FOR_NOT_SET_SYNTHETIC_ATTRIBUTE,
    CONSIDER_NAMELESS_TYPES_AS_JAVALANGOBJECT,
    RECONSTRUCT_VARIABLE_NAMES_FROM_DEBUG_INFO,
    REMOVE_EMPTY_EXCEPTION_RANGES,
    DEINLINE_FINALLY_STRUCTURES,
    ALLOW_ONLY_ASCII_CHARACTERS_IN_STRINGS,
    RENAME_AMBIGUOUS_CLASSES_AND_CLASS_ELEMENTS,

    DECODE_ENUM_SWITCH,
    SUGARENUMS,
    DECODE_STRING_SWITCH,
    ARRAYITER,
    COLLECTIONITER,
    INNER_CLASSES,
    REMOVE_BOILER_PLATE,
    REMOVE_INNER_CLASS_SYNTHETICS,
    DECODE_LAMBDAS,
    LIFT__CONSTRUCTOR_INIT,
    REMOVE_DEAD_METHODS,
    REMOVE_BAD_GENERICS,
    SUGAR_ASSERTS,
    SUGAR_BOXING,
    SHOW_VERSION,
    DECODE_FINALLY,
    TIDY_MONITORS,
    LENIENT,
    DUMP_CLASSPATH,
    COMMENTS,
    FORCE_TOP_SORT,
    FORCE_TOP_SORT_AGGRESS,
    FORCE_EXCEPTION_PRUNE,
    STRING_BUFFER,
    STRING_BUILDER,
    SILENT,
    RECOVER,

    OVERRIDE,
    SHOW_INFERRABLE,
    AEXAGG,
    FORCE_COND_PROPAGATE,
    HIDE_UTF,
    HIDE_LONG_STRINGS,
    COMMENT_MONITORS,
    ALLOW_CORRECTING,
    LABELLED_BLOCKS,
    J14CLASSOBJ,
    HIDE_LANG_IMPORTS,
    RECOVER_TYPE_CLASH,
    RECOVER_TYPE__HINTS,
    FORCE_RETURNING_IFS,
    FOR_LOOP_AGG_CAPTURE,

    ALWAYS_GENERATE_EXCEPTION_VARIABLE_FOR_CATCH_BLOCKS,
    EXCLUDE_NESTED_TYPES,
    SHOW_DEBUG_LINE_NUMBERS,
    INCLUDE_LINE_NUMBERS_IN_BYTECODE,
    INCLUDE_ERROR_DIAGNOSTICS,
    SHOW_SYNTHETIC_MEMBERS,
    SIMPLIFY_MEMBER_REFERENCES,
    MERGE_VARIABLES,
    FORCE_EXPLICIT_TYPE_ARGUMENTS,
    FORCE_EXPLICIT_IMPORTS,
    FLATTEN_SWITCH_BLOCKS,
    RETAIN_POINTLESS_SWITCHES,
    RETAIN_REDUNDANT_CASTS,
    UNICODE_OUTPUT_ENABLED,

    VIEW_ANDROID_PERMISSIONS,
    VIEW_MANIFEST,
    CHANGE_CLASSFILE_VERSIONS,

    DEX_TO_JAR,
    ENJARIFY,
    PROCYON_SETTINGS,
    CFR_SETTINGS,
    FERNFLOWER_SETTINGS,
    PROCYON,
    CFR,
    FERNFLOWER,
    KRAKATAU,
    JDGUI,
    JADX,
    SMALI_DEX,
    SMALI,
    DISASSEMBLER,
    ERROR,
    SUGGESTED_FIX_DECOMPILER_ERROR,
    SUGGESTED_FIX_COMPILER_ERROR,
    PROCYON_DECOMPILER,
    CFR_DECOMPILER,
    FERNFLOWER_DECOMPILER,
    JADX_DECOMPILER,
    JD_DECOMPILER,
    BYTECODE_DISASSEMBLER,
    FILES,
    QUICK_FILE_SEARCH_NO_FILE_EXTENSION,
    WORK_SPACE,
    EXACT,
    DRAG_CLASS_JAR,
    SEARCH,
    SEARCH_STRING,
    SEARCH_FROM,
    SEARCH_REGEX,
    OWNER,
    NAME,
    DESC,
    RESULTS,
    REFRESH,
    MIN_SDK_VERSION,
    ANNOTATION_NAME,
    MATCH_CASE,
    EXACT_PATH,
    PRINT_LINE_NUMBERS,
    AUTO_OPEN,
    ;

    private final TranslatedComponentReference componentReference;

    TranslatedComponents()
    {
        this.componentReference = new TranslatedComponentReference();
        this.componentReference.key = name();
    }

    public TranslatedComponentReference getTranslatedComponentReference()
    {
        return componentReference;
    }
}
