package in.startv.hspatcher;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.EditText;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Lightweight Brazilian Portuguese UI translation layer.
 * The upstream app builds much of its interface from hard-coded Java strings;
 * this translates visible labels without changing patching behavior or APK contents.
 */
public final class PtBr {
    private static final Map<String, String> TEXT;
    static {
        Map<String, String> m = new HashMap<>();
        put(m, "PATCH WORKSHOP", "OFICINA DE PATCHES");
        put(m, "Stage, patch, sign, and reinstall with a calmer progress flow and clearer target context.", "Prepare, aplique patches, assine e reinstale com um progresso claro e informações do aplicativo selecionado.");
        put(m, "Persistent signing", "Assinatura persistente");
        put(m, "ACTIVE TARGET", "APK SELECIONADO");
        put(m, "MISSION CONSOLE", "CONSOLE DE OPERAÇÕES");
        put(m, "Normal-language status stays on top while the detailed log remains available below.", "O status da operação aparece aqui; o registro detalhado fica disponível abaixo.");
        put(m, "Ready. Select an APK to begin the next patch run.", "Pronto. Selecione um APK para iniciar o patch.");
        put(m, "Patch Arcade", "Arcade de patches");
        put(m, "Score 0  Streak 0", "Pontos 0  Sequência 0");
        put(m, "A lightweight micro-break while the patch pipeline completes its background stages.", "Um pequeno passatempo enquanto o processo de patch é concluído em segundo plano.");
        put(m, "🔧  SELECT APK", "🔧  SELECIONAR APK");
        put(m, "📱  EXTRACT FROM INSTALLED APP", "📱  EXTRAIR DE APLICATIVO INSTALADO");
        put(m, "⚡ PATCH", "⚡ APLICAR PATCH");
        put(m, "✕ CANCEL", "✕ CANCELAR");
        put(m, "📲 INSTALL PATCHED APK", "📲 INSTALAR APK MODIFICADO");
        put(m, "🗑 UNINSTALL", "🗑 DESINSTALAR");
        put(m, "🔧 MOD ANOTHER", "🔧 MODIFICAR OUTRO");
        put(m, "Select APK", "Selecionar APK");
        put(m, "Extract APK", "Extrair APK");
        put(m, "Install patched APK", "Instalar APK modificado");
        put(m, "No target package detected yet", "Nenhum pacote de destino detectado");
        put(m, "Install permission is required to install APKs", "É necessária permissão para instalar APKs");
        put(m, "Ready. Select an APK to patch.", "Pronto. Selecione um APK para aplicar o patch.");
        put(m, "Loading file from path...", "Carregando arquivo...");
        put(m, "Ready to patch. Press ⚡ PATCH to begin.", "Pronto para aplicar o patch. Toque em ⚡ APLICAR PATCH para começar.");
        put(m, "No patched APK found", "Nenhum APK modificado encontrado");
        put(m, "No target package detected yet", "Nenhum pacote de destino detectado");
        put(m, "⚠️ Already Patched", "⚠️ Já modificado");
        put(m, "Patch Anyway", "Aplicar patch mesmo assim");
        put(m, "Cancel", "Cancelar");
        put(m, "Uninstall & Install", "Desinstalar e instalar");
        put(m, "Try Anyway", "Tentar mesmo assim");
        put(m, "Keep Current Version", "Manter versão atual");
        put(m, "⚠️ Signature Mismatch", "⚠️ Assinatura diferente");
        put(m, "⚠️ Older Build Downloaded", "⚠️ Foi baixada uma versão antiga");
        put(m, "Uninstall", "Desinstalar");
        put(m, "Download from Play Store", "Baixar da Play Store");
        put(m, "Enter a package name or search query:", "Digite o nome do pacote ou um termo de pesquisa:");
        put(m, "Download", "Baixar");
        put(m, "Select App to Download", "Selecione o aplicativo para baixar");
        put(m, "No patched APK found", "Nenhum APK modificado encontrado");
        put(m, "Certificate loaded — embedded in all patched APKs", "Certificado carregado — será incluído em todos os APKs modificados");
        put(m, "📄", "📄");
        put(m, "MANAGE", "GERENCIAR");
        put(m, "Replace Certificate", "Substituir certificado");
        put(m, "Swap out the current certificate for a new one", "Troque o certificado atual por um novo");
        put(m, "NEW", "NOVO");
        put(m, "No certificate loaded — import to enable MITM proxy support", "Nenhum certificado carregado — importe um para ativar o suporte a proxy MITM");
        put(m, "CA certificate deleted", "Certificado CA excluído");
        put(m, "Signed APK saved to Downloads", "APK assinado salvo em Downloads");
        put(m, "CA cert imported: ", "Certificado CA importado: ");
        put(m, "Import failed: ", "Falha na importação: ");
        put(m, "APK Signer", "Assinador de APK");
        put(m, "🔐 APK Signer", "🔐 Assinador de APK");
        put(m, "Professional signing workspace with custom cert controls", "Área de assinatura profissional com controles personalizados de certificado");
        put(m, "Use saved keystores or generate secure RSA certs with v1/v2/v3 signing.", "Use chaves salvas ou gere certificados RSA seguros com assinatura v1/v2/v3.");
        put(m, "Certificate Configuration", "Configuração do certificado");
        put(m, "Common Name (CN)", "Nome comum (CN)");
        put(m, "Organization (O)", "Organização (O)");
        put(m, "Country (C)", "País (C)");
        put(m, "Key Alias", "Apelido da chave");
        put(m, "Keystore Password", "Senha do repositório de chaves");
        put(m, "Key Password", "Senha da chave");
        put(m, "Validity (years)", "Validade (anos)");
        put(m, "Key Size", "Tamanho da chave");
        put(m, "Signing Schemes", "Esquemas de assinatura");
        put(m, "Recommended: keep all enabled for best compatibility.", "Recomendado: mantenha todas as opções ativadas para maior compatibilidade.");
        put(m, "💾 SAVE KEY", "💾 SALVAR CHAVE");
        put(m, "📂 LOAD KEY", "📂 CARREGAR CHAVE");
        put(m, "Keystore Management", "Gerenciamento de chaves");
        put(m, "APK To Sign", "APK para assinar");
        put(m, "No APK selected", "Nenhum APK selecionado");
        put(m, "📱 SELECT APK", "📱 SELECIONAR APK");
        put(m, "✅ SIGN APK", "✅ ASSINAR APK");
        put(m, "Ready. Configure certificate and select an APK.", "Pronto. Configure o certificado e selecione um APK.");
        put(m, "← BACK TO PATCHER", "← VOLTAR AO PATCHER");
        put(m, "DB Editor", "Editor de banco de dados");
        put(m, "🗄️ DB Editor", "🗄️ Editor de banco de dados");
        put(m, "SQLite Database Viewer & Editor", "Visualizador e editor de bancos de dados SQLite");
        put(m, "📂 OPEN DB", "📂 ABRIR BANCO");
        put(m, "No database loaded", "Nenhum banco de dados carregado");
        put(m, "Table: ", "Tabela: ");
        put(m, "◀ Prev", "◀ Anterior");
        put(m, "Next ▶", "Próxima ▶");
        put(m, "📋 Schema", "📋 Estrutura");
        put(m, "➕ Insert", "➕ Inserir");
        put(m, "💾 Export", "💾 Exportar");
        put(m, "Raw SQL", "SQL direto");
        put(m, "▶ EXECUTE SQL", "▶ EXECUTAR SQL");
        put(m, "Ready. Open a .db or .sqlite file to start.", "Pronto. Abra um arquivo .db ou .sqlite para começar.");
        put(m, "Error opening: ", "Erro ao abrir: ");
        put(m, " rows in ", " linhas em ");
        put(m, "Page ", "Página ");
        put(m, "Error: ", "Erro: ");
        put(m, "No data", "Sem dados");
        put(m, "(empty table)", "(tabela vazia)");
        put(m, "Edit: ", "Editar: ");
        put(m, "Column: ", "Coluna: ");
        put(m, "Set to NULL", "Definir como NULL");
        put(m, "Save", "Salvar");
        put(m, "Delete Row?", "Excluir linha?");
        put(m, "Are you sure you want to delete this row? This cannot be undone.", "Tem certeza de que deseja excluir esta linha? Essa ação não pode ser desfeita.");
        put(m, "Delete", "Excluir");
        put(m, "Insert Row into ", "Inserir linha em ");
        put(m, "Schema: ", "Estrutura: ");
        put(m, "OK", "OK");
        put(m, "Exported to Downloads", "Exportado para Downloads");
        put(m, "Built With Real Tools", "Feito com ferramentas reais");
        put(m, "HSPatcher 3.60 combines Play Store downloads, split merge, Frida-based patching, persistent signing, patched-app updates, large-APK memory fixes, and stronger error recovery in one app.", "O HSPatcher reúne downloads da Play Store, união de APKs divididos, patches com Frida, assinatura persistente, atualização de apps modificados, melhorias para APKs grandes e recuperação de erros.");
        put(m, "Thanks to the upstream projects and reverse-engineering tools that make the workflow possible.", "Agradecimentos aos projetos originais e às ferramentas de engenharia reversa que tornam esse fluxo possível.");
        put(m, "Respect upstream licenses when redistributing builds or bundled tooling.", "Respeite as licenças dos projetos originais ao redistribuir compilações ou ferramentas incluídas.");
        put(m, "CREDITS", "CRÉDITOS");
        put(m, "Find / Replace", "Localizar / Substituir");
        put(m, "🔎 Find / Replace", "🔎 Localizar / Substituir");
        put(m, "Open a text file → search → replace → save • Handles large files", "Abra um arquivo de texto → pesquise → substitua → salve • Suporta arquivos grandes");
        put(m, "📂 OPEN", "📂 ABRIR");
        put(m, "💾 SAVE", "💾 SALVAR");
        put(m, "📤 SAVE AS", "📤 SALVAR COMO");
        put(m, "No file loaded", "Nenhum arquivo carregado");
        put(m, "Search", "Pesquisar");
        put(m, "text or regex pattern", "texto ou padrão de expressão regular");
        put(m, "Whole word", "Palavra inteira");
        put(m, "Regex", "Regex");
        put(m, "Replace", "Substituir");
        put(m, "replacement text", "texto de substituição");
        put(m, "🔎 FIND NEXT", "🔎 LOCALIZAR PRÓXIMA");
        put(m, "✏ REPLACE", "✏ SUBSTITUIR");
        put(m, "REPLACE ALL", "SUBSTITUIR TUDO");
        put(m, "⛔ CANCEL", "⛔ CANCELAR");
        put(m, "Status: idle", "Status: inativo");
        put(m, "File content", "Conteúdo do arquivo");
        put(m, "Replace All (large file)", "Substituir tudo (arquivo grande)");
        put(m, "Stream-process entire file (", "Processar o arquivo inteiro em fluxo (");
        put(m, "Status: ", "Status: ");
        put(m, "Loading: ", "Carregando: ");
        put(m, "Loaded: ", "Carregado: ");
        put(m, "Loaded (stream mode): ", "Carregado (modo de fluxo): ");
        put(m, "Extracting ", "Extraindo ");
        put(m, "Preparing target", "Preparando destino");
        put(m, "Verifying source package and staging the extraction workspace.", "Verificando o pacote de origem e preparando a extração.");
        put(m, "Ready. Returning to patcher...", "Pronto. Voltando ao patcher...");
        put(m, "Search by app name or package, then launch the right flow from a single row.", "Pesquise pelo nome do aplicativo ou pacote e escolha a ação na linha correspondente.");
        put(m, "Search apps or package names", "Pesquisar aplicativos ou nomes de pacote");
        put(m, "Include system apps", "Incluir aplicativos do sistema");
        put(m, "Fast local package scan", "Pesquisa local rápida de pacotes");
        put(m, "Play-linked targets only", "Somente aplicativos vinculados à Play Store");
        put(m, "TARGETS", "APLICATIVOS");
        put(m, "SCANNING", "PESQUISANDO");
        put(m, "Target Search", "Pesquisa de aplicativos");
        put(m, "No apps are visible with the current filters.", "Nenhum aplicativo está visível com os filtros atuais.");
        put(m, "No apps were returned by the package scan. Try enabling system apps or refresh the screen.", "A pesquisa não encontrou aplicativos. Tente incluir os aplicativos do sistema ou atualizar a tela.");
        put(m, "No HSPatcher-installed apps were detected on this device yet.", "Nenhum aplicativo instalado pelo HSPatcher foi detectado neste dispositivo.");
        put(m, "No matches for '", "Nenhum resultado para '");
        put(m, "'. Try the package name or a shorter keyword.", "'. Tente o nome do pacote ou uma palavra-chave menor.");
        put(m, "PLAY SYNC", "SINCRONIZAÇÃO PLAY");
        put(m, "PATCH INVENTORY", "LISTA DE MODIFICADOS");
        put(m, "BACKUP MODE", "MODO DE BACKUP");
        put(m, "EXTRACTION MODE", "MODO DE EXTRAÇÃO");
        put(m, "Backup Targets", "Aplicativos para backup");
        put(m, "Choose an installed package to return its original APK paths without staging a temp extract.", "Escolha um pacote instalado para obter os caminhos dos APKs originais sem criar uma extração temporária.");
        put(m, "Review HSPatcher-managed installs and jump straight into the Play update handoff with clean package metadata.", "Veja os aplicativos gerenciados pelo HSPatcher e inicie a atualização pela Play Store.");
        put(m, "Filter the installed library down to patched targets so updates and maintenance stay fast and deliberate.", "Filtre a lista para mostrar apenas aplicativos modificados e facilitar atualizações e manutenção.");
        put(m, "Return the original APK paths immediately for backup and archive workflows without performing a temp extraction.", "Retorne os caminhos dos APKs originais para backup e arquivamento, sem extração temporária.");
        put(m, "Scan the device, find the right installed target, and stage the package cleanly for patching with split-awareness preserved.", "Pesquise os aplicativos instalados e prepare o pacote para receber o patch, preservando o suporte a APKs divididos.");
        put(m, "Version-aware rows tuned for direct Play update selection.", "Lista com versões para selecionar atualizações diretas pela Play Store.");
        put(m, "Only HSPatcher-managed installs are shown in this list.", "Esta lista mostra apenas aplicativos gerenciados pelo HSPatcher.");
        put(m, "Large touch targets, metadata chips, and fast selection for extraction.", "Botões maiores, informações resumidas e seleção rápida para extração.");
        put(m, "Installed Apps", "Aplicativos instalados");
        put(m, "Patched Apps", "Aplicativos modificados");
        put(m, "Patched App Updates", "Atualizações de aplicativos modificados");
        put(m, "OPEN", "ABRIR");
        put(m, "BACKUP", "BACKUP");
        put(m, "UPDATE", "ATUALIZAR");
        put(m, "APP DECK", "PAINEL DE APLICATIVOS");
        put(m, "WORKFLOW", "FLUXO DE TRABALHO");
        put(m, "Utility Deck", "Painel de ferramentas");
        put(m, "TOOLS", "FERRAMENTAS");
        put(m, "FAST ACTIONS", "AÇÕES RÁPIDAS");
        put(m, "LOW FRICTION", "FÁCIL DE USAR");
        put(m, "PATCH OPERATIONS", "OPERAÇÕES DE PATCH");
        put(m, "APK SIGNER", "ASSINADOR DE APK");
        put(m, "Sign patched APKs", "Assinar APKs modificados");
        put(m, "Re-sign packages quickly with the built-in signer", "Assine pacotes rapidamente com o assinador integrado");
        put(m, "READY", "PRONTO");
        put(m, "DATABASE", "BANCO DE DADOS");
        put(m, "Browse tables, inspect rows, and edit SQLite files", "Navegue pelas tabelas, inspecione linhas e edite arquivos SQLite");
        put(m, "EDIT", "EDITAR");
        put(m, "SYNC + DISCOVERY", "SINCRONIZAÇÃO E BUSCA");
        put(m, "PLAY STORE", "PLAY STORE");
        put(m, "Download from Play", "Baixar pela Play Store");
        put(m, "Download APKs directly from Google Play Store", "Baixe APKs diretamente da Google Play Store");
        put(m, "FETCH", "OBTER");
        put(m, "UPDATES", "ATUALIZAÇÕES");
        put(m, "Detect HSPatcher installs and update them from Play in one flow", "Detecte instalações do HSPatcher e atualize-as pela Play Store em um único fluxo");
        put(m, "SYNC", "SINCRONIZAR");
        put(m, "ABOUT", "SOBRE");
        put(m, "PROJECT", "PROJETO");
        put(m, "Credits", "Créditos");
        put(m, "See the libraries and upstream projects behind HSPatcher", "Veja as bibliotecas e projetos originais usados pelo HSPatcher");
        put(m, "Fast patching, direct downloads, and cleaner project visibility", "Patches rápidos, downloads diretos e informações mais claras do projeto");
        put(m, "Certificate", "Certificado");
        put(m, "CA Certificate", "Certificado CA");
        put(m, "Embedded into every patched APK for MITM proxy support.", "Incluído em cada APK modificado para oferecer suporte a proxy MITM.");
        put(m, "Supports Reqable, Charles, mitmproxy and Burp Suite. Certificate is stored once and embedded in every patched APK automatically.", "Compatível com Reqable, Charles, mitmproxy e Burp Suite. O certificado é salvo uma vez e incluído automaticamente em cada APK modificado.");
        put(m, "IMPORT", "IMPORTAR");
        put(m, "Import Certificate", "Importar certificado");
        put(m, "Select .crt / .pem / .cer / .der from storage", "Selecione um arquivo .crt, .pem, .cer ou .der");
        put(m, "ADD", "ADICIONAR");
        put(m, "DANGER", "PERIGO");
        put(m, "Remove Certificate", "Remover certificado");
        put(m, "Permanently delete the stored CA certificate", "Excluir permanentemente o certificado CA salvo");
        put(m, "DEL", "EXCLUIR");
        put(m, "DISMISS", "FECHAR");
        put(m, "Close", "Fechar");
        put(m, "MITM proxy certificate manager", "Gerenciador de certificado para proxy MITM");
        put(m, "Sign APK", "Assinar APK");
        put(m, "Open DB", "Abrir banco de dados");
        put(m, "Execute SQL", "Executar SQL");
        put(m, "Select app", "Selecionar aplicativo");
        put(m, "Find Next", "Localizar próxima");
        put(m, "Replace All", "Substituir tudo");
        put(m, "Score 0  Streak 0", "Pontos 0  Sequência 0");
        put(m, "Utility Deck", "Painel de ferramentas");
        put(m, "Signing, patch maintenance, Play sync, and support tools arranged as a cleaner operations sheet.", "Assinatura, manutenção de patches, sincronização com a Play Store e ferramentas de suporte.");
        put(m, "FAST ACTIONS", "AÇÕES RÁPIDAS");
        put(m, "LOW FRICTION", "FÁCIL DE USAR");
        put(m, "PATCH OPERATIONS", "OPERAÇÕES DE PATCH");
        put(m, "SYNC + DISCOVERY", "SINCRONIZAÇÃO E BUSCA");
        put(m, "Fast patching, direct downloads, and cleaner project visibility", "Patches rápidos, downloads diretos e informações mais claras do projeto");
        put(m, "CA Certificate", "Certificado CA");
        put(m, "Embedded into every patched APK for MITM proxy support.", "Incluído em cada APK modificado para oferecer suporte a proxy MITM.");
        put(m, "Supports Reqable, Charles, mitmproxy and Burp Suite. Certificate is stored once and embedded in every patched APK automatically.", "Compatível com Reqable, Charles, mitmproxy e Burp Suite. O certificado é salvo uma vez e incluído automaticamente em cada APK modificado.");
        put(m, "Select .crt / .pem / .cer / .der from storage", "Selecione um arquivo .crt, .pem, .cer ou .der no armazenamento");
        put(m, "Permanently delete the stored CA certificate", "Excluir permanentemente o certificado CA salvo");
        put(m, "MITM proxy certificate manager", "Gerenciador de certificado para proxy MITM");
        put(m, "This APK was previously patched by HSPatcher", "Este APK já foi modificado pelo HSPatcher");
        put(m, "Uninstall \"", "Desinstalar \"");
        put(m, "This will remove all app data.", "Isso removerá todos os dados do aplicativo.");
        put(m, "Download from Play Store", "Baixar da Play Store");
        put(m, "Enter a package name or search query:", "Digite o nome do pacote ou um termo de pesquisa:");
        put(m, "Select App to Download", "Selecione o aplicativo para baixar");
        put(m, "Already Patched", "Já modificado");
        put(m, "Signature Mismatch", "Assinatura diferente");
        put(m, "Older Build Downloaded", "Foi baixada uma versão antiga");
        put(m, "No patched APK found", "Nenhum APK modificado encontrado");
        put(m, "No target package detected yet", "Nenhum pacote de destino detectado");
        put(m, "APK was previously patched", "O APK já recebeu um patch");
        put(m, "Signature verification failed", "Falha na verificação da assinatura");
        put(m, "Certificate loaded — embedded in all patched APKs", "Certificado carregado — será incluído em todos os APKs modificados");
        put(m, "Certificate Configuration", "Configuração do certificado");
        put(m, "Common Name (CN)", "Nome comum (CN)");
        put(m, "Organization (O)", "Organização (O)");
        put(m, "Country (C)", "País (C)");
        put(m, "Key Alias", "Apelido da chave");
        put(m, "Keystore Password", "Senha do repositório de chaves");
        put(m, "Key Password", "Senha da chave");
        put(m, "Validity (years)", "Validade (anos)");
        put(m, "Signing Schemes", "Esquemas de assinatura");
        put(m, "Keystore Management", "Gerenciamento de chaves");
        put(m, "APK To Sign", "APK para assinar");
        put(m, "Database", "Banco de dados");
        put(m, "Open database", "Abrir banco de dados");
        put(m, "Delete Row?", "Excluir linha?");
        put(m, "Are you sure you want to delete this row? This cannot be undone.", "Tem certeza de que deseja excluir esta linha? Essa ação não pode ser desfeita.");
        put(m, "Insert Row into ", "Inserir linha em ");
        put(m, "Ready. Open a .db or .sqlite file to start.", "Pronto. Abra um arquivo .db ou .sqlite para começar.");
        put(m, "Enter a package name or search query:", "Digite o nome do pacote ou um termo de pesquisa:");
        put(m, "Select App to Download", "Selecione o aplicativo para baixar");
        put(m, "Use saved keystores or generate secure RSA certs with v1/v2/v3 signing.", "Use chaves salvas ou gere certificados RSA seguros com assinatura v1/v2/v3.");
        put(m, "Built With Real Tools", "Feito com ferramentas reais");
        put(m, "Respect upstream licenses when redistributing builds or bundled tooling.", "Respeite as licenças dos projetos originais ao redistribuir compilações ou ferramentas incluídas.");
        put(m, "HSPatcher 3.60 combines Play Store downloads, split merge, Frida-based patching, persistent signing, patched-app updates, large-APK memory fixes, and stronger error recovery in one app.", "O HSPatcher reúne downloads da Play Store, união de APKs divididos, patches com Frida, assinatura persistente, atualização de apps modificados, melhorias para APKs grandes e recuperação de erros em um único app.");
        put(m, "Import Certificate", "Importar certificado");
        put(m, "Remove Certificate", "Remover certificado");
        put(m, "Sign patched APKs", "Assinar APKs modificados");
        put(m, "Browse tables, inspect rows, and edit SQLite files", "Navegue pelas tabelas, inspecione linhas e edite arquivos SQLite");
        put(m, "Download APKs directly from Google Play Store", "Baixe APKs diretamente da Google Play Store");
        put(m, "Detect HSPatcher installs and update them from Play in one flow", "Detecte instalações do HSPatcher e atualize-as pela Play Store em um único fluxo");
        put(m, "See the libraries and upstream projects behind HSPatcher", "Veja as bibliotecas e projetos originais usados pelo HSPatcher");
        put(m, "Sign APK", "Assinar APK");
        put(m, "Signing, patch maintenance, Play sync, and support tools arranged as a cleaner operations sheet.", "Assinatura, manutenção de patches, sincronização com a Play Store e ferramentas de suporte.");
        put(m, "Tap the drifting sparks while HSPatcher finishes the patch.", "Toque nas faíscas enquanto o HSPatcher termina o patch.");
        put(m, "Signing Log", "Registro da assinatura");
        put(m, "e.g. in.startv.hotstar or JioHotstar", "por exemplo, in.startv.hotstar ou JioHotstar");
        put(m, "CERTIFICATE", "CERTIFICADO");
        put(m, "What would you like to do?", "O que deseja fazer?");
        TEXT = Collections.unmodifiableMap(m);
    }

    private PtBr() {}

    private static void put(Map<String, String> map, String source, String translated) {
        map.put(source, translated);
    }

    public static String t(String value) {
        if (value == null) return null;
        String translated = TEXT.get(value);
        if (translated != null) return translated;
        if (value.startsWith("Score ")) {
            return value.replace("Score ", "Pontos ")
                .replace("Streak ", "Sequência ")
                .replace("Best ", "Melhor ");
        }
        if (value.startsWith("Error: ")) return "Erro: " + value.substring(7);
        if (value.startsWith("Error opening: ")) return "Erro ao abrir: " + value.substring(15);
        if (value.startsWith("Install failed: ")) return "Falha na instalação: " + value.substring(15);
        if (value.startsWith("Failed to launch ")) return "Falha ao abrir " + value.substring(17);
        if (value.startsWith("Loading: ")) return "Carregando: " + value.substring(9);
        if (value.startsWith("Loaded: ")) return "Carregado: " + value.substring(8);
        if (value.startsWith("Loaded (stream mode): ")) return "Carregado (modo de fluxo): " + value.substring(22);
        if (value.startsWith("Extracting ")) return "Extraindo " + value.substring(11);
        if (value.startsWith("Insert Row into ")) return "Inserir linha em " + value.substring(16);
        if (value.startsWith("Edit: ")) return "Editar: " + value.substring(6);
        if (value.startsWith("Column: ")) return "Coluna: " + value.substring(8);
        if (value.startsWith("Table: ")) return "Tabela: " + value.substring(7);
        if (value.startsWith("Page ")) return "Página " + value.substring(5);
        if (value.startsWith("Status: ")) return "Status: " + value.substring(8);
        if (value.startsWith("CA cert imported: ")) return "Certificado CA importado: " + value.substring(18);
        if (value.startsWith("Import failed: ")) return "Falha na importação: " + value.substring(15);
        return value;
    }

    /** Translate all visible text, including labels updated dynamically during long operations. */
    public static void apply(Activity activity) {
        View decor = activity.getWindow().getDecorView();
        ViewTreeObserver observer = decor.getViewTreeObserver();
        observer.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override public boolean onPreDraw() {
                if (!decor.getViewTreeObserver().isAlive()) return true;
                translateTree(decor);
                return true;
            }
        });
    }

    public static void translateTree(View root) {
        if (root instanceof EditText) {
            EditText edit = (EditText) root;
            CharSequence hint = edit.getHint();
            if (hint != null) {
                String mapped = t(hint.toString());
                if (!hint.toString().equals(mapped)) edit.setHint(mapped);
            }
        }
        if (root instanceof TextView) {
            TextView textView = (TextView) root;
            CharSequence text = textView.getText();
            if (text != null) {
                String mapped = t(text.toString());
                if (!text.toString().equals(mapped)) textView.setText(mapped);
            }
        }
        if (root instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) root;
            for (int i = 0; i < group.getChildCount(); i++) translateTree(group.getChildAt(i));
        }
    }
}
