package dev.rama27.emailApp.model;

public class EmailAccount {
    private String username;
    private String password;
    private String imapServer;
    private int port;
    private boolean isSslEnabled;

    public EmailAccount(String username, String password, String imapServer, boolean isSslEnabled, int port) {
        this.username = username;
        this.password = password;
        this.imapServer = imapServer;
        this.isSslEnabled = isSslEnabled;
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImapServer() {
        return imapServer;
    }

    public void setImapServer(String imapServer) {
        this.imapServer = imapServer;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isSslEnabled() {
        return isSslEnabled;
    }

    public void setSslEnabled(boolean sslEnabled) {
        isSslEnabled = sslEnabled;
    }
}
