package br.com.xandecoelho5.proxy.remoteResource.services;

public class ResourceProxy implements Resource {
    private Resource realResource;
    private final String tokenProvided;

    public ResourceProxy(String tokenProvided) {
        this.tokenProvided = tokenProvided;
    }

    @Override
    public String getData() {
        String validToken = "v@lid!";
        if (!tokenProvided.equals(validToken)) return "Invalid Token";
        if (realResource == null) {
            try {
                realResource = new ResourceImpl();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realResource.getData();
    }
}
