package com.lavadip.smt;

import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;

public class LocalSecurityPolicy extends Policy {
  public LocalSecurityPolicy() {
    System.out.println("Created");
  }


  @Override
  public boolean implies(ProtectionDomain domain, Permission permission) {
    // Need to customize based on domain
    return false;
  }

  @Override
  public PermissionCollection getPermissions(CodeSource codesource) {
    System.out.println("Returning permissions");
    final Permissions permissions = new Permissions();
    // returning empty permissions
    // add more as per your liking
    return permissions;
  }

}
